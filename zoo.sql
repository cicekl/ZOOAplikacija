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
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `djelatnik`
--

LOCK TABLES `djelatnik` WRITE;
/*!40000 ALTER TABLE `djelatnik` DISABLE KEYS */;
INSERT INTO `djelatnik` VALUES (32,'VG21PWYV1554613761118083','Carey','Heller'),(33,'KZ91974EUZ3MOWyFu6U0','Marvin','Feeney'),(36,'GR106400476J3K3pcTAGNH7l3j6','Kecia','Aufderhar'),(37,'MR2816084913664094791320564','Valerie','Weimann'),(38,'HR0333172662194537516','Otto','Brekke'),(39,'CY436304268238z0sW893066D3b3','Maximina','Carter'),(40,'ES6610454763867657772227','Vincent','Aufderhar'),(42,'HR0850166092509251464','Miki','Biki'),(44,'HR0576349212539874808','Ivan','Ivanković'),(48,'HR0650022506528554198','Shae','Glover'),(57,'HR0309017514137991504','Korina','Price'),(59,'HR0067084749701356684','Christia','Kol'),(60,'HR0357494355610432038','Rudolf','Feeney'),(61,NULL,'Samira','Price'),(62,'HR0515731137722619134','Dražen','Zečić'),(63,'HR0991241921083673782','Halid','Bešlić'),(64,'HR0363640387139863613','Jasmin','Stavros'),(67,'HR0514746742775996755','Tinki','Vinki'),(69,'HR0309714148793297916','Eduarda','Josif'),(71,NULL,'Samira','Price'),(72,NULL,'Rudolf','Feeney'),(76,NULL,'Otto','Brekke');
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
INSERT INTO `operater` VALUES (1,'admin@zoo.hr','Admin','$2a$10$JAocAeuerBCRI7yK3l/DWuWPtL1ZLZ45ZhZJ0FDNrKcHNALlw/WSu','08872767447','Operater');
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
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prostorija`
--

LOCK TABLES `prostorija` WRITE;
/*!40000 ALTER TABLE `prostorija` DISABLE KEYS */;
INSERT INTO `prostorija` VALUES (31,529,'Za ribe',179,792),(32,160,'Za paučnjake',434,1766),(34,551,'Za kukce',449,574),(36,730,'Za gmazove',183,2151),(43,4919,'Za sisavce',1297,94),(44,120,'Za vodozemce',120,120),(46,574,'Za mekušce',864,151),(47,551,'Za kukce',449,574),(48,730,'Za gmazove',183,2151),(51,120,'Za ptice',120,120),(52,120,'Za ptice',120,120);
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
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zivotinja`
--

LOCK TABLES `zivotinja` WRITE;
/*!40000 ALTER TABLE `zivotinja` DISABLE KEYS */;
INSERT INTO `zivotinja` VALUES (50,'1972-12-04 00:00:00.000000','1972-12-04 00:00:00.000000','1992-02-29 00:00:00.000000','Sivka',6877,1324,'Siva vjeverica','Sisavci',71,47),(52,'2023-04-01 00:00:00.000000','2023-04-01 00:00:00.000000',NULL,'Čoki',42,42342,'Kanarinac','Paučnjaci',67,31),(54,'2023-04-01 00:00:00.000000','2023-04-01 00:00:00.000000',NULL,'Nemo',353,5435,'Ribica','Ribe',72,48),(59,'2023-02-08 00:00:00.000000','2016-04-08 00:00:00.000000',NULL,'Krabba',323,1230,'Smeđi rak','Rakovi',33,34),(60,'2023-04-03 00:00:00.000000','2012-07-13 00:00:00.000000',NULL,'Žabica',1728000,14400,'Crna žaba','Vodozemci',62,44),(61,'2023-02-03 00:00:00.000000','2014-04-11 00:00:00.000000',NULL,'Fiki',1728000,14400,'Žaba','Vodozemci',62,44),(62,'2016-07-16 00:00:00.000000','2012-07-21 00:00:00.000000',NULL,'Žarko',8,4,'Puž','Mekušci',62,46),(63,'2023-01-13 00:00:00.000000','2013-10-17 00:00:00.000000',NULL,'Rotkvica',100,10,'Dodo','Ptice',76,52),(64,'2020-04-10 00:00:00.000000','2019-03-13 00:00:00.000000',NULL,'Šaki',100,10,'Šaran','Ribe',69,31);
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

-- Dump completed on 2023-04-12 13:31:51
