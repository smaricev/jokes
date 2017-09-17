create table category (id  serial not null, name varchar(255) not null, primary key (id));
create table joke (id  serial not null, content varchar(255) not null, dislikes int default 0, likes int default 0, category int not null, primary key (id));
alter table joke add constraint FKdfboxhr9p13built47f9weg9q foreign key (category) references category;

Insert into category VALUES (DEFAULT ,'Škola');
Insert into category VALUES (DEFAULT ,'Mujo');
Insert into category VALUES (DEFAULT ,'Chuck Norris');
Insert into category VALUES (DEFAULT ,'Informatika');

Insert into joke VALUES (DEFAULT ,'Pozvao učitelj u školu oca jednog učenika pa mu govori:
- Dragi gospodine, vi čini se imate nekakve moderne metode u odgoju djece, ali znajte, batine katkad znaju biti korisne. Jeste li ikad istukli svoje dijete?
- Jesam jednom, ali u samoobrani!',DEFAULT ,DEFAULT,1);
Insert into joke VALUES (DEFAULT ,'Učili djeca u školi slovo "A". Učiteljica napiše na tabli slovo A i kaže:
- Tko če pogoditi ovo slovo?
Perica skine kapu i baci je prema tabli
- Ja sam pogodio!!',DEFAULT ,DEFAULT,1);
Insert into joke VALUES (DEFAULT ,'Pita Mama Pericu:
- Ima li petica u školi?
- Ima, dobivaju djeca.',DEFAULT ,DEFAULT,1);
Insert into joke VALUES (DEFAULT ,'Koja je razlika između dvojkaša i odlikaša?
- Gotovo nikakva...
- Dvojkaš sve zaboravi 5 min prije testa, a odlikaš sve zaboravi 5 min poslije testa.',DEFAULT ,DEFAULT,1);

Insert into joke VALUES (DEFAULT ,'Zasto cigu u prvom razredu niko ne sme da tuce?
- Zato sto ima tatu u osmom!
',DEFAULT ,DEFAULT,1);
Insert into joke VALUES (DEFAULT ,'Dođu Mujo i Haso u Njemački restoran i kaže Haso konobaru dva pivenzija jedan ćevapenzi i jedan picezni.Kaže Haso Muji vidiš kako je dobro znati Njemački.Kaže konobar Hasi dobio bi ti govnenzi da ja nisam iz Tuzle
',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Vuku Mujo i Hasno mrtvog medveda i nalete na Kanadjanina.
Kanadjanin upita: Grizli?Grizli?
A na to ce oni:Ma šta grizli...davili po sata ba!
',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Kaže Fata Muji:
• Dokazano je da dete 80 odsto inteligencije nasledi od majke!
Mujo će:
• E, jeeeeeste, a od oca, kao, samo 35 odsto?
',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Našao Mujo novu curu i hvali se Hasi da je jako dobra u sexu.
Pita ga Haso: Je li Mujo, a kako si se ti pokazao kod nje?
Mujo odgovara: Bolan Haso, ja sam ti što kažu sportski komentatori, ušao u "anale".',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Ide mujina tasta na aerodrom i mujo se moli da sto pre ode i kad je uzletela mujo kaze ''BOZE UZMI JE SAD TI JE NAJBLIZA''''',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Otisli Mujo i Haso u Ameriku i tamo se prodavao "hot dog".
Gleda Haso u rečnik i kaže:
- E jarane, odo'' ja da probam ono "vruće kuče".
Posle pet minuta vraća se Haso, gleda u onaj Hot-Dog i kaže:
- pa od celog kučeta meni baš kurac spakovali!',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Mujo: Haso bolan koliko je tebi godina?
Haso: 21!
Mujo: I već imaš četvoro dece?!
Haso: Da, ali više ni sa viršli najlon ne skidam!',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Pita Mujo Hasu:
- jel ti puši krava?
- ne puši, Što?
- onda ti gori štala!',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Vraćaju se Mujo i Haso s posla. Mujo:
- Jedva čekam da dođem doma i da strgnem ženine gaćice.
- A tako si jako napaljen?
- Ma ne, stišću me.',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Pita Haso Muju:
- Šta ti se više dopada ajfon ili ajped?
Mujo odgovara:
- Meni se najviše dopada ajvar!',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Utrči Mujo u kafanu:
- Haso, Haso, neko nam je ukrao auto.
- Pa jesi li video ko je to uradio?
-Nisam, ali sam zapisao registraciju.',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Pita Mujo Hasu:
-Hoces li kupiti pola teleta?
-Hocu vraga, pa da mi stalnoo pada po dvoristu!?',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Mujo:
• Ono što sam iz španskih serija naučio, to je da poštujem kućnu pomoćnicu. Možda mi je
majka...',DEFAULT ,DEFAULT,2);
Insert into joke VALUES (DEFAULT ,'Chuck norris nije ništa, spužva Bob roštilja pod vodom.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norris je izračunao posljednju znamenku broja PI.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norris je 2 puta brojio do bezbroj.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norris je za jedan dan sa jednim bikom obradio svu zemlju u Slavoniji.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norris je skupio sve Pokemone i još dva.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norris zna odgovor na ženino pitanje: gdje si bio?.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norrisu Yugo uvijek upali iz prve!.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Chuck Norris zna zašto je Bog prvo stvorio muškarca pa onda ženu.',DEFAULT ,DEFAULT,3);
Insert into joke VALUES (DEFAULT ,'Kaže drug drugu:
- Je l‘ si čuo da postoji život van neta?
- Lažeš, daj link!',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Microsoft je kupio Skype za 8,5 milijardi dolara.
Budale, mogli su ga besplatno skinuti s interneta.',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Nemam Tviter pa idem okolo sa megafonom i objavljujem šta radim i šta mi se dešava preko dana. Zasad imam troje koji me prate, a mislim da su dvojica panduri...',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Šta je to hardver?
- Dio koji podnosi udarce kad softver ne radi!',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Google je žensko sto posto!
Čim ima odgovor na sve.',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Meni će na svadbi svirati grupa "Youtube".
Nema pesme koju frajeri ne znaju.',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'-Kako se zove glavni grad Facebook-a?
-Lajkovac',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Isla Crvenkapica u sumu i sretne vuka:
-Dobar dan!
-Dobar dan!
Crvenkapica:-Idem baki mozete li mi dati njezinu adresu
Vuk:-Mogu....www.baka.hr...:D',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Dino Merlin prati svjetske trendove, njegovo novo umjetničko ime je Ctrl + C – Ctrl + V

',DEFAULT ,DEFAULT,4);
Insert into joke VALUES (DEFAULT ,'Cura: Šta Radiš ?
Dečko: Idem platiti internet .
Cura: Aa mislim inače ?
Dečko: Paa inače će mi ga isključiti !!!',DEFAULT ,DEFAULT,4);







