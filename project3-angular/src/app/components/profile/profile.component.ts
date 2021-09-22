import { Component, OnInit } from '@angular/core';
import { ReadlistService } from 'src/app/services/readlist.service';
import { IReadlist } from 'src/app/models/readlist.model';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/services/user';
import { UserProfileService } from 'src/app/services/user-profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  displayedPage: number = 0;

  readlists: IReadlist[] = [];
  userLoggedIn: boolean = false;
  userHasReadlist: boolean = false;
  currentUser: User = {
    userId: 0,
    firstName: "test",
    lastName: "user",
    mobile: "",
    email: "",
    username: "",
    password: ""
  };

  constructor(private readlistService: ReadlistService,
    private userService: UserService, private profileService: UserProfileService) { }

    ngOnInit(): void {
      this.userLoggedIn = false;
      this.userHasReadlist = false;
      this.currentUser = this.userService.getCurrentUser();
  
      if (this.currentUser.userId != 0) {
        this.userLoggedIn = true;
      }
  
      this.readlistService.getReadlistById(this.currentUser.userId).subscribe(data => {
        this.readlists = data;
        if (data.length != 0) {
          this.userHasReadlist = true;
        }
      });
    }
  
    public removeBook(data: IReadlist) {
      if (data.readListId != undefined) {
        this.readlistService.deleteReadlistEntry(data.readListId)
          .subscribe(() => this.ngOnInit());
      }
    }
  
    public addBook(bookISBN: number) { 
      this.readlistService.addReadlistEntry(bookISBN);
    }

    public changePage(pageNumber: number) {
      this.displayedPage = pageNumber;
    }

}
