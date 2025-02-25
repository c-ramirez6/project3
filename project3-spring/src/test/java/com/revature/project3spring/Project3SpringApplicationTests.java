package com.revature.project3spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.project3spring.entities.Book;
import com.revature.project3spring.entities.ReadList;
import com.revature.project3spring.entities.User;
import com.revature.project3spring.repositories.BookRepository;
import com.revature.project3spring.repositories.ReadListRepository;
import com.revature.project3spring.services.UserService;

@SpringBootTest
class project3SpringApplicationTests {

	@Autowired
	UserService userService;

	@Autowired
	BookRepository bookRepo;

	@Autowired
	ReadListRepository rlRepo;

//	@Test
//	public void testAddUser() {
//		User user = User.builder()
//				.email("t@gmail.com")
//				.firstName("Mary")
//				.lastName("Jane")
//				.username("TesterMaryJane123")
//				.password("password")
//				.mobile("999-999-9999")
//				.build();
//		userService.saveUser(user);
//	}

//	@Test
//	public void testAddBooks()	{
//		Book book = Book.builder()
//				.isbn(9781841499789L)
//				.title("Bloodfire Quest")
//				.author("Terry Brooks")
//				.summary("The adventure that started in Wards of Faerie takes a thrilling new turn, in the second novel of New York Times bestselling author Terry Brooks")
//				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/0/0/7/9200000009027007.jpg")
//				.price(24.5)
//				.build();
//		
//		Book book2 = Book.builder()
//				.isbn(9780751548525L)
//				.title("Safe Haven")
//				.author("Nicholas Sparks")
//				.summary("Love hurts. There is nothing as painful as heartbreak. But in order to learn to love again you must learn to trust again. ")
//				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/0/5/2/3/9200000010683250.jpg")
//				.price(33.8)
//				.build();
//		
//		bookRepo.save(book);
//		bookRepo.save(book2);
//	}

// 	@Test
// 	public void testAddReadListEntry()	{
// 		User user = userService.getUserById(1);
// 		Book book = bookRepo.getById(9781841499789L);
// 		Book book2 = bookRepo.getById(9780751548525L);

// 		ReadList list = ReadList.builder()
// 				.user(user)
// 				.book(book)
// 				.build();
// 		rlRepo.save(list);

// 		ReadList list2 = ReadList.builder()
// 				.user(user)
// 				.book(book2)
// 				.build();
// 		rlRepo.save(list2);
// 	}

	@Test
	public void populateBooksTable() {
		Book book1 = Book.builder().isbn(9789000307975L).title("Vrienden voor het leven").author("Maeve Binchy").summary(
				"Vrienden voor het leven is het verhaal van drie vriendinnen die op weg naar volwassenheid verwikkeld raken in een zonderlinge driehoeksverhouding. Benny en Eve, boezemvriendinnen uit het Ierse dorpje Knockglen, gaan in Dublin studeren en sluiten daar al snel vriendschap met de aantrekkelijke en ambitieuze Nan. Het opwindende studentenleven brengt hun echter niet alleen geluk maar ook verdriet. Met haar grote vermogen om menselijke gevoelens herkenbaar neer te zetten weet Maeve Binchy geluk en verdriet, warmte en humor samen te brengen in deze meeslepende roman. Vrienden voor het leven verscheen voor het eerst in 1991 en is het favoriete boek van vele Maeve Binchy-fans. Het boek is inmiddels toe aan de zeventiende druk. In 1995 werd het zeer succesvol verfilmd onder de titel Circle of Friends met Minnie Driver en Chris O’Donnell in de hoofdrollen.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/5/3/6/6/1001004011806635.jpg").price(10.00)
				.build();
		
		Book book2 = Book.builder().isbn(9780552159722L).title("Deception point").author("Dan Brown").summary(
				"When a new NASA satellite detects evidence of an astonishingly rare object buried deep in the Arctic ice, the floundering space agency proclaims a much-needed victory.. a victory that has profound implications for U.S. space policy and the impending presidential election. With the Oval Office in the balance, the President dispatches White House Intelligence analyst Rachel Sexton to the Arctic to verify the authenticity of the find. Accompanied by a team of experts, including the charismatic academic Michael Tolland, Rachel uncovers the unthinkable - evidence of scientific trickery - a bold deception that threatens to plunge the world into controversy..")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/8/8/9/8/1001004006878988.jpg").price(9.99)
				.build();
		
		Book book3 = Book.builder().isbn(9789022558027L).title("Magic staff").author("Terry Brooks").summary(
				"Vijf eeuwen geleden werd de wereld door een noodlottige demonenoorlog in de as gelegd. De overlevenden hebben een toevluchtsoord gevonden in een door magie beschermde vallei, maar nu staat een genadeloos leger op het punt de vallei binnen te vallen. De enige hoop op redding voor de overlevenden was Sider Ament, maar hij leeft niet meer. Sider was de drager van de enig overgebleven zwarte staf, een machtige talisman die eeuwenlang door de Ridders van het Woord is doorgegeven en die van cruciaal belang is bij het in evenwicht houden van de magie op de wereld. Om de wereld van de ondergang te redden, moet de magie van de staf behouden blijven. Panterra Qu, een jonge Spoorzoeker aan wie de staf na Siders dood wordt doorgegeven, heeft grote moeite om de macht ervan naar zijn hand te zetten. Alles moet op alles worden gezet, want eenieder zal een hoge tol betalen als de oorlog tussen het Woord en de Leegte naar de duisternis dreigt af te glijden. ")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/2/2/5/2/9200000002212522.jpg").price(17.50)
				.build();
		
		Book book4 = Book.builder().isbn(9781841499789L).title("Bloodfire Quest").author("Terry Brooks").summary(
				"The adventure that started in Wards of Faerie takes a thrilling new turn, in the second novel of New York Times bestselling author Terry Brooks’s brand-new trilogy—The Dark Legacy of Shannara! The quest for the long-lost Elfstones has drawn the leader of the Druid order and her followers into the hellish dimension known as the Forbidding, where the most dangerous creatures banished from the Four Lands are imprisoned. Now the hunt for the powerful talismans that can save their world has become a series of great challenges: a desperate search for kidnapped comrades, a relentless battle against unspeakable predators, and a grim race to escape the Forbidding alive. But though freedom is closer than they know, it may come at a terrifying price. Back in the village of Arborlon, the mystical, sentient tree that maintains the barrier between the Four Lands and the Forbidding is dying. And with each passing day, as the breach between the two worlds grows larger, the threat of the evil eager to spill forth and wreak havoc grows more dire. The only hope lies with a young Druid, faced with a staggering choice: cling to the life she cherishes or combat an army of darkness by making the ultimate sacrifice.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/0/0/7/9200000009027007.jpg").price(24.50)
				.build();
		
		Book book5 = Book.builder().isbn(9781409117933L).title("A Week in Winter").author("Maeve Binchy").summary(
				"Stoneybridge is full of holiday-makers in summer, its beaches are full of buckets and spades and sandcastles; but in winter it's cold and wild. Few choose to walk along the fine sands, the big round pebbles and the exposed rocky promontories that make up the wind-swept Atlantic coastline. Those who do can't help but see Stone House, the big house on the cliff; once falling into disrepair it is now a beautiful hotel specialising in winter holidays. Its big, warm kitchen, its open log-fires and its elegant bedrooms provide a welcome few can resist, whatever their reasons for coming. Henry and Nicola are burdened with a terrible secret, while cheerful nurse Winnie finds herself on the holiday from hell. John has arrived on an impulse after he missed a flight at Shannon; eccentric Freda claims to be a psychic - and a part-time hairdresser. Then there's Nora, a silent watchful older woman who seems ready to disapprove at any moment.. A Week in Winter is full of Maeve's trademark warmth, humour and characters you want to spend time with.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/6/2/8/0/9200000008070826.jpg").price(11.99)
				.build();
		
		Book book6 = Book.builder().isbn(9789460681387L).title("Blue Curacao").author("Linda van Rijn").summary(
				"Als haar kersverse echtgenoot tijdens de huwelijksreis spoorloos verdwijnt, staat Hannah voor een raadsel. Hoe goed kent ze eigenlijk de mensen die ze altijd... De romantische huwelijksreis van Hannah en Koen naar Curaçao wordt ruw verstoord als Koen tijdens het snorkelen spoorloos verdwijnt. Hannah wordt gek van angst. De plaatselijke politie loopt niet zo hard als Hannah zou willen en ten einde raad gaat ze zelf op onderzoek uit. Die zoektocht brengt onaangename waarheden aan het licht. Als Hannah zelfs voor haar eigen leven moet vrezen, wordt ze geconfronteerd met de vraag of ze Koen wel zo goed kent als ze denkt.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/0/9/4/2/9200000010732490.jpg").price(48.99)
				.build();
		
		Book book7 = Book.builder().isbn(9780751548525L).title("Safe Haven").author("Nicholas Sparks").summary(
				"Love hurts. There is nothing as painful as heartbreak. But in order to learn to love again you must learn to trust again. When a mysterious young woman named Katie appears in the small town of Southport, her sudden arrival raises questions about her past. Beautiful yet unassuming, Katie is determined to avoid forming personal ties until a series of events draws her into two reluctant relationships. Despite her reservations, Katie slowly begins to let down her guard, putting down roots in the close-knit community. But even as Katie starts to fall in love, she struggles with the dark secret that still haunts her ...")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/0/5/2/3/9200000010683250.jpg").price(33.80)
				.build();
		
		Book book8 = Book.builder().isbn(9789023429258L).title("De wereld volgens Garp").author("John Irving").summary(
				"De wereld volgens Garp is een zeldzaam komische, originele maar ook schokkende roman die John Irving in één klap beroemd maakte. Sinds de verschijning in 1978 hebben miljoenen lezers genoten van de excentrieke, non-conformistische Jenny, haar zoon T.S. Garp en de fanatici, onschuldige kinderen, transseksuelen, hoeren, worstelaars en de vele andere figuren die de wereld van Garp bevolken. De wereld volgens Garp is een klassieker, een meesterlijke tragikomedie die een diepe indruk op de lezer zal achterlaten.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/6/3/6/7/1001004005997636.jpg").price(19.90)
				.build();
		
		Book book9 = Book.builder().isbn(9789460680854L).title("Winter Chalet").author("Linda van Rijn").summary(
				"Vier vriendinnen genieten van een skivakantie in Kirchberg. De moord op een van hen stelt iedereen voor een raadsel... Tijdens een gezellige skivakantie in het Oostenrijkse Kirchberg kunnen de vriendinnen Isa, Chantal, Karen en Annemieke eindelijk weer eens tijd met z'n vieren doorbrengen. Karen, Chantal en Isa arriveren op de zaterdag, Annemieke sluit later aan, ze moet nog werken. De vakantie van de drie begint heel genoeglijk. De vriendinnen hebben de kans echt bij te praten, wat er in het drukke dagelijks leven vaak bij in schiet, en het is prachtig weer om te skien, wat ze dan ook met veel plezier doen. Maar de gezellige skivakantie krijgt een noodlottige wending op de dag dat Annemieke arriveert. Bij aankomst treft ze een van haar vriendinnen dood aan. Rechercheur GŸnter Wolfsberg van de politie in Kirchberg start een onderzoek. Hij verhoort alle vriendinnen en hun partners en ontdekt dat onder het oppervlak van gelukkige relaties en intense vriendschap de nodige spanningen schuilgaan. Het heeft er alle schijn van dat sommige mensen wel erg graag de schuld willen afschuiven...")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/6/6/6/7/9200000002547666.jpg").price(15.00)
				.build();
		
		Book book10 = Book.builder().isbn(9789023464044L).title("De Vliegeraar").author("Khaled Hosseini").summary(
				"Amir en Hassan zijn gevoed door dezelfde min en groeien samen op in de hoofdstad van Afghanistan. Als blijk van hun verbondenheid kerft Amir hun namen in een granaatappelboom: 'Amir en Hassan, de sultans van Kabul'. Maar sultans zijn ze alleen in hun fantasie, want Amir hoort tot de bevoorrechte bevolkingsgroep en Hassan en zijn vader zijn arme Hazaren, in dienst van Amirs vader. Bij de jaarlijkse vliegerwedstrijd in Kabul is Amir de vliegeraar, degene die het touw van de vlieger in handen heeft. Hassan is zijn hulpje, de vliegervanger. 'Voor jou doe ik alles!' roept Hassan hem toe voordat hij wegrent om de vallende vlieger uit de lucht op te vangen. Die grenzeloze loyaliteit is niet wederzijds. Wanneer er iets vreselijks gebeurt met Hassan verraadt hij zijn trouwe metgezel. Na de Russische inval vluchten Amir en zijn vader naar de Verenigde Staten. Amir bouwt er een nieuw bestaan op, maar hij slaagt er niet in Hassan te vergeten. De ontdekking van een schokkend familiegeheim voert hem uiteindelijk terug naar Afghanistan, dat inmiddels door de Taliban is bezet. Daar wordt Amir geconfronteerd met spoken uit zijn verleden. Zijn voornemen om zijn oude schuld jegens Hassan in te lossen sleept hem tegen wil en dank mee in een huiveringwekkend avontuur. De vliegeraar is verfilmd door Marc Foster als The Kite Runner.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/6/3/5/1/1001004010981536.jpg").price(6.90)
				.build();
		
		Book book11 = Book.builder().isbn(9789024529445L).title("De delta deceptie").author("Dan Brown").summary("Hij is terug... Een wetenschappelijke revolutie, een verbijsterende misleiding, een razendsnelle thriller! Onder het poolijs ligt iets wat de wereld voorgoed kan veranderen... Een NASA-satelliet doet een opzienbarende ontdekking op de Noordpool. Dat is een opsteker voor de ruimtevaartorganisatie, die al tijden onder vuur ligt. Ook voor president Zach Herney betekent de vondst goed nieuws: een tweede termijn in het Witte Huis lijkt in zicht. De president vraagt Rachel Sexton, analiste bij de inlichtingendienst NRO, na te gaan of de vondst authentiek is. In allerijl vertrekt ze naar het noordpoolgebied om het werk van een team wetenschappers, onder wie de charismatische oceanograaf Michael Tolland, te controleren. Maar na Rachels aankomst neemt de zaak een onverwachte wending. Het 'bewijs' lijkt minder rotsvast dan gedacht. Voor de president gewaarschuwd kan worden, begint een nachtmerrie op het poolijs. Een speciale eenheid maakt werk van zijn missie: kost wat kost voorkomen dat de waarheid uitkomt... Na Het Juvenalis dilemma, maar vóór De Da Vinci code, schreef Dan Brown deze 'verfijnde mengeling van actie en intriges' (Publishers Weekly). Opnieuw besteedt hij aandacht aan een schimmige geheime dienst. Deze National Reconnaissance Office is nauw verweven met de beroemde ruimtevaartorganisatie NASA. Dan Brown is dé bestsellerauteur van dit moment. De Da Vinci code stond maandenlang op 1 in de top tienen, en ook Het Bernini mysterie en Het Juvenalis dilemma vonden moeiteloos hun weg naar de consument. Ook dit jaar zal in het teken staan van Dan Brown, omdat in mei The Da Vinci Code, dé grote publieksfilm van 2006, wereldwijd in première gaat.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/5/0/5/5/1001004006225505.jpg").price(14.95)
				.build();
		
		Book book12 = Book.builder().isbn(9781408842423L).title("And the Mountains Echoed").author("Khaled Hosseini").summary("And the Mountains Echoed is a deeply moving story about how we love, how we take care of one another and how the choices we make resonate through generations. With profound wisdom, depth, insight and compassion 'and moving from Kabul, to Paris, to San Francisco, to the Greek island of Tinos' Hosseini writes about the bonds that define us and shape our lives, the ways that we help our loved ones in need and how we are often surprised by the people closest to us. Six years in the writing, Khaled Hosseini says of his new book: 'My earlier novels were, at heart, tales of fatherhood and motherhood. My new novel is a multi-generational family story as well, this time revolving around brothers and sisters, and the ways in which they love, wound, betray, honour and sacrifice for each other.'")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/0/6/0/3/9200000010223060.jpg").price(8.99)
				.build();
		
		Book book13 = Book.builder().isbn(9789044309904L).title("Hou je mond!").author("Sophie Kinsella").summary("Emma heeft, zoals alle jonge vrouwen ter wereld, een paar geheimpjes. Voor haar ouders, haar vriend, haar collega's. Zo werd ze ontmaagd in de logeerkamer terwijl haar ouders een film zaten te kijken en ze vindt haar vriend Connor een beetje op Ken lijken. Die van Barbie en Ken. Ze geeft de plant van haar irritante collega sinaasappelsap - bijna dagelijks - en haar string doet pijn. Emma is altijd nerveus als ze moet vliegen. Daarom vertelt ze al haar geheimen zomaar aan een ardige vreemde man die naast haar in het vliegtuig zit. Tenminste, Emma denkt dat het een vreemde is. Want wanneer ze de volgende dag op haar werk komt... Sophie Kinsella is bestsellerschrijfster en journaliste. Ze woont in Londen. Ze heeft weinig grote geheimen, behalve dat ze niet dol is op vliegen.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/8/3/1/6/1001004002056138.jpg").price(10.00)
				.build();
		
		Book book14 = Book.builder().isbn(9789023467786L).title("In een mens").author("John Irving").summary("In een mens is een meeslepende roman over verlangen, geheimhouding en seksuele identiteit. Een boek over de liefde in al haar verschijningsvormen en een gepassioneerd betoog voor seksuele verscheidenheid. Billy, de biseksuele hoofdpersoon, vertelt het tragikomische verhaal (dat meer dan vijf decennia beslaat) van zijn leven als ‘seksuele verdachte’, een term die John Irving voor het eerst gebruikte in zijn onsterfelijke roman De wereld volgens Garp. Dit is John Irvings meest politieke roman sinds De regels van het ciderhuis en Bidden wij voor Owen Meany en een treffend eerbetoon aan Billy’s vrienden en minnaars – een bonte verzameling personages die de lezer niet licht zal vergeten. Het is een onvergetelijk portret van de eenzame, biseksuele man die zich voorgenomen heeft om 'echt belangrijk' te zijn.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/0/7/8/7/9200000000037870.jpg").price(19.90)
				.build();
		
		Book book15 = Book.builder().isbn(9780751548556L).title("The lucky one").author("Nicholas Sparks").summary("Do you believe in lucky charms? While in Iraq, U.S. Marine Logan Thibault finds a photo, half-buried in the dirt, of a woman. He carries it in his pocket, and from then on his luck begins to change. Back home, Logan is haunted by thoughts of war. Over time, he becomes convinced that the woman in the photo holds the key to his destiny. So he finds the vulnerable and loving Beth and a passionate romance begins. But Logan battles with the one secret he has kept from Beth: how he found her in the first place. And it is a secret that could utterly destroy everything they love ...")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/0/3/7/1001004011797307.jpg").price(9.80)
				.build();
		
		Book book16 = Book.builder().isbn(9780751542974L).title("Best of me").author("Nicholas Sparks").summary("The new epic love story by the bestselling author of The Last Song and The Notebook. They were teenage sweethearts from opposite sides of the tracks - with a passion that would change their lives for ever. But life would force them apart. Years later, the lines they had drawn between past and present are about to slip.. Called back to their hometown for the funeral of the mentor who once gave them shelter when they needed it most, they are faced with each other once again and forced to confront the paths they chose. Can true love ever rewrite the past?")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/4/6/2/8/9200000001208264.jpg").price(13.80)
				.build();
		
		Book book17 = Book.builder().isbn(9789000316090L).title("Hotel aan zee").author("Maeve Binchy").summary("In de zomer is het gezellig druk in het badplaatsje Stoneybridge. Overal slenteren vakantiegangers rond en de stranden zijn bezaaid met emmers, schepjes en zandkastelen. Maar in de winter begeeft bijna niemand zich naar de prachtige stranden en de woeste kliffen die samen de ruige westkust van Ierland vormen. De enkeling die toch naar de kust gaat, kan niet om hotel Stone House heen. Daar kan iedere gast rekenen op een warm welkom van eigenaresse Chicky Starr, ongeacht de reden van zijn komst. Zo dragen Henry en Nicola een afschuwelijk geheim met zich mee, ziet de vrolijke verpleegkundige Winnie haar vakantie in het water vallen en komt John op de bonnefooi aanwaaien nadat hij zijn vlucht heeft gemist. De excentrieke Freda is paragnost - en parttime kapper. En dan is er nog Nora, een zwijgzame oudere dame die overal zo het hare van lijkt te denken. Hotel aan zee is een hartverwarmende roman met alle ingrediënten van een echte Maeve Binchy: warmte, humor en heerlijke personages met wie je graag je tijd doorbrengt!")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/2/1/0/9200000009850127.jpg").price(14.99)
				.build();
		
		Book book18 = Book.builder().isbn(9789024561858L).title("Inferno").author("Dan Brown").summary("Inferno, de vierde Robert Langdon-thriller, speelt zich af in Italië. `Hoewel ik al tijdens mijn studie Dantes Inferno heb gelezen, heb ik pas onlangs, toen ik onderzoek deed in Florence, echte waardering gekregen voor de invloed van Dantes werk op de moderne tijd,' verklaart Brown. `Ik verheug me erop in mijn nieuwe boek de lezers mee te nemen op een reis naar deze mysterieuze wereld, een landschap vol codes, symbolen en geheime doorgangen.'")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/8/9/9/9/9200000010839998.jpg").price(17.49)
				.build();
		
		Book book19 = Book.builder().isbn(9789046113110L).title("In het hart").author("David Baldacci").summary("Dit is het aangrijpende verhaal van de twaalfjarige Louisa Mae Cardinal, die in New York woont met haar verlegen broertje Oz. Het is 1940 en ze hebben het niet gemakkelijk, want het inkomen van hun vader, die schrijver is, is niet hoog. Maar dat kan Lou niet zoveel schelen, want ze aanbidt haar vader en is gek op zijn verhalen. Maar dan, in één verschrikkelijk moment, verandert Lou's leven voorgoed. Een auto-ongeluk maakt een einde aan hun vaders leven, waardoor zij en Oz moeten verhuizen naar het verre Virginia. Daar, in het isolement van de desolate bergen, komen ze te wonen bij hun excentrieke overgrootmoeder Louisa, Lou's naamgenote. Geplaatst tegenover nieuwe verantwoordelijkheden ziet Lou zich gedwongen snel volwassen te worden. Daar, op haar overgrootmoeders eenvoudige boerderij, op het land waarvan haar vader zo hield en waarover hij steeds weer schreef, ontdekt zij wie zij werkelijk is en wat zij kan betekenen voor deze wereld. En wanneer een vernietigend noodlot hun nieuwe huis treft kan zij de strijd die volgt het hoofd bieden; een strijd die gaat om recht en overleving en die gestreden wordt in een overvolle rechtszaal in Virginia...")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/2/6/2/1/1001004005971262.jpg").price(5.00)
				.build();
		
		Book book20 = Book.builder().isbn(9781447229902L).title("The Hit").author("David Baldacci").summary("The trap is set. Failure is not an option. When government hit man Will Robie is given his next target he knows he’s about to embark on his toughest mission yet. He is tasked with killing one of their own, following evidence to suggest that fellow assassin Jessica Reel has been turned. She’s leaving a trail of death in her wake including her handler. The trap is set. To send a killer to catch a killer. But what happens when you can’t trust those who have access to the nation’s most secret intelligence?")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/6/5/2/3/9200000009123256.jpg").price(21.99)
				.build();
		
		Book book21 = Book.builder().isbn(9789044339482L).title("De Tennisparty").author("Sophie Kinsella").summary("Het tennisweekend is Patricks idee. Zijn nieuwe landhuis, gekocht met de bonussen van zijn baan als beleggingsadviseur, is de ideale locatie. Patricks vrouw Caroline weet nog niet wat de werkelijke reden voor het feestje is. Zij vindt het leuk om haar oude buren Stephen en Annie weer te zien, maar ze is minder blij met de snoeverige Charles en zijn verwende vrouw Cressida. En het laatste koppel, Don en Valerie, beiden bloedfanatiek, is helemaal onuitstaanbaar. Terwijl de vier stellen zich op het zonnige terras installeren, lijkt al vast te staan wie de winnaars zijn in het leven en wie de verliezers. Maar wanneer de eerste bal over het net wordt geslagen, is dat het begin van twee dagen flirten, driftbuien, knallende ruzies en schokkende onthullingen. Door de komst van een ongenode gast wordt duidelijk dat dit weekend helemaal niets met tennis te maken heeft. Lang voordat ze beroemd werd met haar Shopaholic! serie schreef Sophie Kinsella onder haar eigen naam, Madeleine Wickham, zeven romans. De tennis party, haar allereerste boek, verscheen toen ze pas vierentwintig was en is daarom altijd heel bijzonder voor haar gebleven. Daarna volgden onder andere Het zwemfeestje en De vraagprijs. Haar werk is in meer dan dertig talen verschenen. De auteur woont met haar man en kinderen in Londen. 'Een rake roman met scherpe observaties. Licht maar dodelijk.' Mail on Sunday")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/3/7/6/4/9200000009984673.jpg").price(18.50)
				.build();
		
		Book book22 = Book.builder().isbn(9780552778459L).title("In One Person").author("John Irving").summary("A compelling novel of desire, secrecy, and sexual identity, In One Person is a story of unfulfilled love—tormented, funny, and affecting—and an impassioned embrace of our sexual differences. Billy, the bisexual narrator and main character of In One Person, tells the tragicomic story (lasting more than half a century) of his life as a “sexual suspect,” a phrase first used by John Irving in 1978 in his landmark novel of “terminal cases,” The World According to Garp. His most political novel since The Cider House Rules and A Prayer for Owen Meany, John Irving’s In One Person is a poignant tribute to Billy’s friends and lovers—a theatrical cast of characters who defy category and convention. Not least, In One Person is an intimate and unforgettable portrait of the solitariness of a bisexual man who is dedicated to making himself 'worthwhile.'")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/3/4/5/9/9200000009409543.jpg").price(25.00)
				.build();
		
		Book book23 = Book.builder().isbn(9789400501157L).title("De aanslag").author("David Baldacci").summary("Will Robie is een van de besten in zijn vak, een huurmoordenaar die nooit twijfelt en altijd zijn doelwit uitschakelt. Hij is de man op wie de Amerikaanse overheid een beroep doet als het gaat om het doden van haar grootste vijanden, van de monsters die talloze onschuldige slachtoffers op hun naam hebben staan. En niemand is zo goed als Robie. Niemand, behalve Jessica Reel... Reel is net als Robie zeer ervaren, uiterst professioneel en dodelijk precies. Maar Reel heeft zich tegen haar werkgever gekeerd en het vizier gericht op haar voormalige collega’s binnen hun agentschap. Nu een van hun eigen mensen moet worden afgestopt, doet men opnieuw een beroep op Robie. Zijn opdracht: zorg dat je Reel te pakken krijgt, levend of dood. Maar wanneer Robie de jacht opent op Reel, ontdekt hij al snel dat zij weleens gegronde redenen kan hebben voor haar verraad. De aanslagen op het agentschap houden verband met een veel groter gevaar. Een gevaar dat Washington D.C., de Verenigde Staten en de rest van de wereld op de grondvesten zal doen schudden...")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/4/8/2/7/9200000010047284.jpg").price(19.99)
				.build();
		
		Book book24 = Book.builder().isbn(9789044339338L).title("Mag ik je nummer even?").author("Sophie Kinsella").summary("Poppy Wyatt is haar verlovingsring kwijt! Een antiek geval, al drie generaties in het bezit van de familie van Magnus, haar aanstaande. Over tien dagen is de bruiloft! En terwijl ze buiten met haar vriendinnen staat te bellen, wordt haar mobieltje plotseling uit haar handen gegrist. Ook dat nog! Nu is de crisis compleet. Wat moet ze zonder telefoon beginnen? Helemaal hyper denkt Poppy dat ze aan het hallucineren is geslagen wanneer ze in een afvalbak zomaar een smartphone ziet liggen. Hebbes! Maar het duurt niet lang voor de eigenaar, de botte zakenman Sam Roxton, zich meldt. En Sam is 'not amused' als Poppy ijskoud weigert haar schat aan hem af te staan.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/3/0/9/4/9200000009984903.jpg").price(10.00)
				.build();
		
		Book book25 = Book.builder().isbn(9789022556627L).title("Jarka Ruus").author("Terry Brooks").summary("Twintig jaar zijn voorbij gegaan sinds Grianne Ohmsford afstand deed van haar leven als de gevreesde Ilse Hek, ze bevrijd werd door de magie van het Zwaard van Shannara en de vernietiging van haar mentor, de Morgawr. Als Grianne plotseling verdwijnt, wordt haar jonge dienaar Tagwen gedwongen de handschoen op te nemen en haar uit de handen van haar vijanden te redden, samen met Griannes jonge neef Pen Ohmsford en de machtige elf Ahren Elessedil.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/8/9/9/1001004011269987.jpg").price(18.95)
				.build();
		
		Book book26 = Book.builder().isbn(9789460680755L).title("Last Minute").author("Linda van Rijn").summary("Op de lastminute-vakantie in Hurghada loopt Susan haar ex-vriend tegen het lijf. Liever had ze hem nooit meer gezien... Vijf jaar zijn Susan Waterberg en haar man Hugo getrouwd en gelukkig in Almere. Die mijlpaal wil Susan niet onopgemerkt voorbij laten gaan. Ze regelt haar schoonouders als oppas voor hun zoontje Stijn van drie en boekt een lastminutevakantie naar Hurghada. Voor Hugo is de trip een grote verrassing, zeker omdat hij zijn PADI (duikbrevet) pas een jaar heeft. Nu kan hij eindelijk echt gaan duiken. Hoewel het afscheid van Stijntje hun beiden zwaar valt, verheugen ze zich op een onbezorgde zonvakantie. Als ze op de duikschool inchecken krijgt Susan de schrik van haar leven. De duikinstructeur is een oude bekende en confronteert haar met een verleden dat ze altijd voor Hugo heeft verzwegen. De zorgeloze strandvakantie die Susan voor ogen had, verandert in een web van leugens en chantage. Om haar gezin te behouden, zal ze definitief moeten afrekenen met haar verleden.")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/2/5/6/7/1001004011817652.jpg").price(4.99)
				.build();
		
		Book book27 = Book.builder().isbn(9789023464143L).title("Duizend schitterende zonnen").author("Khaled Hosseini").summary("De ongeschoolde Mariam is vijftien wanneer ze wordt uitgehuwelijkt aan de dertig jaar oudere schoenverkoper Rasheed in Kabul. Jaren later moet zij de beeldschone en slimme Laila naast zich dulden, die door Rasheed na een raketaanval uit het puin is gered. Rasheed neemt Laila in huis in de hoop dat zij hem de zoon zal schenken die Mariam hem niet kan geven. In eerste instantie overheersen tussen de twee vrouwen gevoelens van achterdocht en jaloezie, maar door de tirannieke houding van Rasheed ontstaat er langzamerhand een innige vriendschap. Samen zetten Mariam en Laila alles op alles om te overleven in de eindeloze oorlog van Afghanistan, die voor hen ook binnenshuis woedt. Na het overweldigende succes van De vliegeraar verrast Khaled Hosseini zijn lezers opnieuw met een verpletterend verhaal")
				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/3/5/1/1001004010981537.jpg").price(16.99)
				.build();
		
		
		bookRepo.save(book1);
		bookRepo.save(book2);
		bookRepo.save(book3);
		bookRepo.save(book4);
		bookRepo.save(book5);
		bookRepo.save(book6);
		bookRepo.save(book7);
		bookRepo.save(book8);
		bookRepo.save(book9);
		bookRepo.save(book10);
		bookRepo.save(book11);
		bookRepo.save(book12);
		bookRepo.save(book13);
		bookRepo.save(book14);
		bookRepo.save(book15);
		bookRepo.save(book16);
		bookRepo.save(book17);
		bookRepo.save(book18);
		bookRepo.save(book19);
		bookRepo.save(book20);
		bookRepo.save(book21);
		bookRepo.save(book22);
		bookRepo.save(book23);
		bookRepo.save(book24);
		bookRepo.save(book25);
		bookRepo.save(book26);
		bookRepo.save(book27);
	}
	
}
