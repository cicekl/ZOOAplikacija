drop database if exists zoo;
create database zoo;
use zoo;

create table zivotinja(
    sifra int not null primary key auto_increment,
    minimalna_kvadratura decimal(18,2) not null,
    minimalna_kubikaza decimal(18,2) not null,
    zivotinjska_vrsta varchar(50) not null, 
    vrsta varchar(50) not null,
    ime varchar(50) null,
    datum_rodenja datetime not null,
    datum_dolaska datetime not null,
    datum_smrti datetime null,
    djelatnik int not null,
    prostorija int not null
);

create table prostorija(
    sifra int not null primary key auto_increment,
    sirina int not null,
    duzina int not null,
    visina int not null,
    naziv varchar(50) null
);

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50) null
);

alter table zivotinja add foreign key(prostorija) references prostorija(sifra);
alter table zivotinja add foreign key(djelatnik) references djelatnik(sifra);

insert into djelatnik(ime,prezime) values('Tibor','Novak'),('Patricija','Kovačić'),
('Patrik','Ivanović'),('Fabijan','Horvat'),('Tea','Hun');

insert into prostorija(sirina,duzina,visina,naziv)
values(35,35,70,'Male ptice'),(150,170,5.000,'Vjeverice'),(50,50,90,'Činčile');

insert into zivotinja(minimalna_kvadratura,minimalna_kubikaza,zivotinjska_vrsta,vrsta,ime,datum_rodenja,datum_dolaska,djelatnik,prostorija)
values(1200.00,42000.00,'Ptice','Kanarinac','Žutokljunac',2022-08-25,2022-11-26,1,1),
(20000.00,40000000.00,'Sisavci','Siva vjeverica','Sivka',2020-10-22,2021-01-01,5,2),
(2000.00,50.00,'Sisavci','Činčila','Frxy',2021-02-14,2021-10-01,3,3);