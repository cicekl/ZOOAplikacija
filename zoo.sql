drop database if exists zoo;
create database zoo;
use zoo;

create table zivotinja(
    sifra int not null primary key auto_increment,
    minimalna_kvadratura decimal(18,2),
    minimalna_kubikaza decimal(18,2),
    vrsta varchar(50),
    ime varchar(50),
    datum_rodenja datetime,
    datum_dolaska datetime,
    datum_smrti datetime,
    djelatnik int,
    prostorija int
);

create table prostorija(
    sifra int not null primary key auto_increment,
    sirina int,
    duzina int,
    visina int,
    naziv varchar(50)
);

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    iban varchar(50)
);

alter table zivotinja add foreign key(prostorija) references prostorija(sifra);
alter table zivotinja add foreign key(djelatnik) references djelatnik(sifra);