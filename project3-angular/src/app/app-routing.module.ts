import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookDetailComponent } from './components/book-detail/book-detail.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { ReadlistComponent } from './components/readlist/readlist.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { ProductsComponent } from './components/products/products.component';
import { RegisterComponent } from './components/register/register.component';
import { AdvSearchComponent } from './components/adv-search/adv-search.component';
import { BookClubComponent } from './components/book-club/book-club.component';
import { BookClubCreateComponent } from './components/book-club-create/book-club-create.component';
import { BookClubUpdateComponent } from './components/book-club-update/book-club-update.component';<<<<<<< .mine
// import { SearchByUsernameComponent } from './components/search-by-username/search-by-username.component';
import { SearchByUsernameComponent } from './components/search-by-username/search-by-username.component';
import { ListUsersComponent } from './components/list-users/list-users.component';
=======
import { BookClubCreateComponent } from './components/book-club-create/book-club-create.component';
import { BookClubUpdateComponent } from './components/book-club-update/book-club-update.component';

>>>>>>> .theirs

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch:'full' },
  { path: 'home', component: HomeComponent },
  { path: 'products', component: ProductsComponent},
  { path: 'products/:search/:searchType/:pageNumber', component: ProductsComponent},
  { path: 'products/:search/:searchType', component: ProductsComponent},
  { path: 'details/:title/:author', component: BookDetailComponent},
  { path: 'detailed/:ISBN', component: BookDetailComponent},
  
  // { path: 'about', component: AboutComponent, canActivate: [AuthGuard] },
  // { path: 'contact', component: ContactComponent, canActivate: [AuthGuard] },
  // { path: 'products/:catName/:catId', component: SubCategoryComponent, canActivate: [AuthGuard] },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  { path: 'readlist', component: ReadlistComponent },
 { path: "advancesearch", component: AdvSearchComponent },
{ path: "profile", component:ProfileComponent},
<<<<<<< .mine
<<<<<<< .mine
  // { path: '**', component: PageNotFoundComponent },
=======
  { path: "profile", component:ProfileComponent},
>>>>>>> .theirs
  {path: 'users', component: SearchByUsernameComponent},
  {path: 'users/:Username', component: ListUsersComponent},
 { path: "profile", component:ProfileComponent},
  { path: '**', component: PageNotFoundComponent }
=======
  // { path: '**', component: PageNotFoundComponent }
  {path: 'bookclub', component: BookClubComponent},
  {path: 'bookclub/create', component: BookClubCreateComponent},
  {path: 'bookclub/:clubId', component: BookClubUpdateComponent},
  {path: 'bookclub/:id', component: BookClubComponent},
  { path: '**', component: PageNotFoundComponent },



>>>>>>> .theirs
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
