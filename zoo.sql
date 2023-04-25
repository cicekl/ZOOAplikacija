-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: zoo
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.27-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `djelatnik`
--

DROP TABLE IF EXISTS `djelatnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `djelatnik` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `IBAN` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `djelatnik`
--

LOCK TABLES `djelatnik` WRITE;
/*!40000 ALTER TABLE `djelatnik` DISABLE KEYS */;
INSERT INTO `djelatnik` VALUES (1,'HR0763810009427350931','Andrej','Uzon'),(2,'HR0785687853148650349','Devon','Hansen'),(3,'HR0286163811416661183','Albie','Cline'),(4,'HR0313862407928456949','Tvrtko','Horvat'),(5,'HR0529597550279435755','Lea','Car'),(6,'HR0337885041017546322','Jade','Zuniga'),(7,'HR0556487421714914004','Ana','Šutalo'),(8,'HR0280796834330749299','Olga','Rudić'),(9,'HR0426684412877258403','Irénée','Cairo'),(10,'HR0174440901833894434','Nediljka','Hardy'),(11,'HR0474847446690245766','Dragiša','Lazar'),(12,'HR0932521209050183391','Jasmin','Ivančica'),(13,'HR0925105869954497765','Vlad','Ivančica'),(14,'HR0036297398093691676','Saša','Martinović'),(15,'HR0130805589327770157','Ljiljana','Stojanova'),(16,'HR0724300705459437617','Sergej','Analowski');
/*!40000 ALTER TABLE `djelatnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operater` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `lozinka` char(61) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (1,'admin@zoo.hr','Admin','$2a$10$vX.z1dD4mHObnYd8irbOn.qc2/RtOtAtShgCcWvW1aC7u0E5HI3sq','08872767447','Operater');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prostorija`
--

DROP TABLE IF EXISTS `prostorija`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prostorija` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `duzina` int(11) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `sirina` int(11) DEFAULT NULL,
  `visina` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prostorija`
--

LOCK TABLES `prostorija` WRITE;
/*!40000 ALTER TABLE `prostorija` DISABLE KEYS */;
INSERT INTO `prostorija` VALUES (1,60,'Male ptice',50,70),(2,50,'Za vjeverice',60,50),(3,30,'Veliki gmazovi',30,30),(4,30,'Kornjače - uz vodu',30,30),(5,70,'Akvarijum',70,70),(6,20,'Mali rakovi',20,20),(7,30,'Slane vode',50,60),(8,30,'Satke vode',50,60),(9,30,'Mala šuma',40,70),(10,40,'Močvarni dio - velike žabe',70,30),(11,40,'Kućica za kukce',60,30),(12,30,'Zmijski dio',80,50),(13,80,'Domaće životinje',80,80),(14,60,'Dio za žirafe',40,30),(15,70,'Za velike sisavce',60,70);
/*!40000 ALTER TABLE `prostorija` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zivotinja`
--

DROP TABLE IF EXISTS `zivotinja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zivotinja` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `datumDolaska` datetime(6) DEFAULT NULL,
  `datumRodenja` datetime(6) DEFAULT NULL,
  `datumSmrti` datetime(6) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `minimalnaKubikaza` int(11) NOT NULL,
  `minimalnaKvadratura` int(11) NOT NULL,
  `vrsta` varchar(255) DEFAULT NULL,
  `zivotinjskaVrsta` varchar(255) DEFAULT NULL,
  `djelatnik_sifra` int(11) DEFAULT NULL,
  `prostorija_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKbprvoqqhtoky779rmoya8yktb` (`djelatnik_sifra`),
  KEY `FKst9uer663v1sb4noirvmq5afu` (`prostorija_sifra`),
  CONSTRAINT `FKbprvoqqhtoky779rmoya8yktb` FOREIGN KEY (`djelatnik_sifra`) REFERENCES `djelatnik` (`sifra`),
  CONSTRAINT `FKst9uer663v1sb4noirvmq5afu` FOREIGN KEY (`prostorija_sifra`) REFERENCES `prostorija` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zivotinja`
--

LOCK TABLES `zivotinja` WRITE;
/*!40000 ALTER TABLE `zivotinja` DISABLE KEYS */;
INSERT INTO `zivotinja` VALUES (1,'2017-07-21 00:00:00.000000','2014-06-12 00:00:00.000000',NULL,'Olgica',10,10,'Močvarna rovka','Sisavci',1,9),(2,'2022-03-11 00:00:00.000000','2019-12-06 00:00:00.000000',NULL,'Ghost',20,20,'Vuk','Sisavci',3,15),(3,'2021-08-14 00:00:00.000000','2018-04-11 00:00:00.000000',NULL,'Dobrica',50,50,'Dobri dupin','Sisavci',4,5),(4,'2021-05-14 00:00:00.000000','2019-04-17 00:00:00.000000','2023-01-01 00:00:00.000000','Roro',10,10,'Kunić','Sisavci',5,9),(5,'2023-02-01 00:00:00.000000','2023-01-01 00:00:00.000000',NULL,'Zelenka',10,10,'Zelena krastača','Vodozemci',1,10),(6,'2020-02-07 00:00:00.000000','2019-06-13 00:00:00.000000','2020-02-08 00:00:00.000000','Pjegi',10,10,'Pjegavi daždevnjak','Vodozemci',11,5),(7,'2012-11-24 00:00:00.000000','2012-10-19 00:00:00.000000',NULL,'Ljepotan',30,30,'Poskok','Gmazovi',13,3),(8,'2012-11-24 00:00:00.000000','2011-09-17 00:00:00.000000','2019-04-20 00:00:00.000000','Bjelica',30,30,'Bjelouška','Gmazovi',13,3),(9,'2023-01-07 00:00:00.000000','2019-10-03 00:00:00.000000',NULL,'Corny',40,40,'Barska kornjača','Gmazovi',15,4),(10,'2015-02-06 00:00:00.000000','2015-02-05 00:00:00.000000','2020-09-10 00:00:00.000000','Zizi',40,40,'Obični zelembać','Gmazovi',15,10),(11,'2020-07-17 00:00:00.000000','2020-02-13 00:00:00.000000',NULL,'Stormi',60,60,'Jegulja','Ribe',9,8),(12,'2016-05-15 00:00:00.000000','2016-05-15 00:00:00.000000','2023-04-01 00:00:00.000000','Ugica',30,30,'Ugotica mala','Ribe',9,7),(13,'2022-04-08 00:00:00.000000','2017-04-15 00:00:00.000000',NULL,'Emi',30,30,'Indijska guska','Ptice',11,1),(14,'2023-04-25 00:00:00.000000','2023-04-25 00:00:00.000000',NULL,'Astacus',20,20,'Riječni rak','Rakovi',3,6),(15,'2023-04-25 00:00:00.000000','2023-04-25 00:00:00.000000',NULL,'Primi',20,20,'Bjelonogi rak','Rakovi',3,6),(16,'2023-04-25 00:00:00.000000','2023-04-25 00:00:00.000000',NULL,'Šećerko',20,20,'Potočni rak','Rakovi',6,8),(17,'2022-11-19 00:00:00.000000','2022-04-15 00:00:00.000000','2023-04-06 00:00:00.000000','Školjkica',3,3,'Kamenica','Mekušci',14,5),(18,'2022-11-19 00:00:00.000000','2022-04-15 00:00:00.000000',NULL,'Pauk',4,4,'Ležipauk','Paučnjaci',14,9),(19,'2022-11-19 00:00:00.000000','2022-04-15 00:00:00.000000',NULL,'Widow',4,4,'Crna udovica','Paučnjaci',14,9),(20,'2022-11-19 00:00:00.000000','2022-04-15 00:00:00.000000',NULL,'Petar',4,4,'Tarantula','Paučnjaci',14,9),(21,'2022-11-19 00:00:00.000000','2021-10-08 00:00:00.000000',NULL,'Žiga',4,4,'Crveni mrav','Kukci',3,9),(22,'2022-11-19 00:00:00.000000','2021-10-08 00:00:00.000000',NULL,'Žuti',4,4,'Žuti mrav','Kukci',3,9),(23,'2022-11-19 00:00:00.000000','2021-10-08 00:00:00.000000',NULL,'Speedy',4,4,'Nosati skakavac','Kukci',3,9),(24,'2022-11-19 00:00:00.000000','2021-10-08 00:00:00.000000',NULL,'Ljubica',4,4,'Leptir','Kukci',3,9),(25,'2022-11-19 00:00:00.000000','2021-10-08 00:00:00.000000',NULL,'Maja',4,4,'Pčela','Kukci',3,9),(26,'2022-11-19 00:00:00.000000','2021-10-08 00:00:00.000000',NULL,'Pavo',4,4,'Pčela','Kukci',3,9);
/*!40000 ALTER TABLE `zivotinja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'zoo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-25 13:23:30
