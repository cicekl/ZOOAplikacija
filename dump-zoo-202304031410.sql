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
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `djelatnik`
--

LOCK TABLES `djelatnik` WRITE;
/*!40000 ALTER TABLE `djelatnik` DISABLE KEYS */;
INSERT INTO `djelatnik` VALUES (31,'IE34HGTJ26410215047304','Samira','Price'),(32,'VG21PWYV1554613761118083','Carey','Heller'),(33,'KZ91974EUZ3MOWyFu6U0','Marvin','Feeney'),(34,'HR0371307488078702058','Christia','Kol'),(35,'ME16631329621258038303','Shae','Glover'),(36,'GR106400476J3K3pcTAGNH7l3j6','Kecia','Aufderhar'),(37,'MR2816084913664094791320564','Valerie','Weimann'),(38,'HR0333172662194537516','Otto','Brekke'),(39,'CY436304268238z0sW893066D3b3','Maximina','Carter'),(40,'ES6610454763867657772227','Vincent','Aufderhar'),(42,'HR0850166092509251464','Miki','Biki'),(44,'HR0576349212539874808','Ivan','Ivanković'),(45,NULL,'Otto','Brekke'),(46,NULL,'Kecia','Aufderhar'),(47,NULL,'Kecia','Aufderhar'),(48,NULL,'Shae','Glover'),(49,NULL,'Kecia','Aufderhar'),(50,NULL,'Kecia','Aufderhar'),(51,NULL,'Kecia','Aufderhar'),(52,NULL,'Kecia','Aufderhar'),(53,NULL,'Carey','Heller');
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
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prostorija`
--

LOCK TABLES `prostorija` WRITE;
/*!40000 ALTER TABLE `prostorija` DISABLE KEYS */;
INSERT INTO `prostorija` VALUES (31,529,'Mallery',179,792),(32,160,'Hollard',434,1766),(33,623,'Farwynd of Sealskin Point',1480,2788),(34,551,'Florent of Brightwater Keep',449,574),(35,574,'Shett of Gulltown',864,151),(36,730,'Bigglestone',183,2151),(37,851,'Kenning of Kayce',1690,1771),(38,840,'Lydden of Deep Den',1461,880),(39,419,'Blackfyre of King\'s Landing',549,2837),(40,376,'Moss',1764,1086),(43,4919,'Za sisavce',1297,94);
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
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zivotinja`
--

LOCK TABLES `zivotinja` WRITE;
/*!40000 ALTER TABLE `zivotinja` DISABLE KEYS */;
INSERT INTO `zivotinja` VALUES (31,'1972-12-04 00:00:00.000000','1972-12-04 00:00:00.000000','1992-02-29 00:00:00.000000','Frxy',6877,1324,'Ljubicasta vjeverica','Kukci',52,31),(32,'1994-11-23 22:23:59.611000','1976-09-04 12:44:25.223000','1980-07-20 11:46:14.902000','sardine',9273,5393,'Gold I','Ahri',39,39),(33,'1983-09-11 13:09:15.640000','1976-03-16 17:08:47.167000','1992-10-01 04:45:41.096000','mink',1471,1328,'Silver I','Brand',39,35),(36,'1976-11-28 07:25:42.072000','1961-11-30 07:44:54.289000','1971-06-20 05:35:12.907000','termite',4403,9361,'Gold IV','Renekton',38,39),(37,'1992-09-16 07:11:43.787000','1970-11-11 22:35:50.479000','1984-11-29 17:22:45.168000','impala',2269,8282,'Iron II','Karma',39,35),(38,'1996-10-11 00:00:00.000000','1990-01-12 00:00:00.000000','1991-11-03 00:00:00.000000','lion',6937,3683,'Challenger','Tristan',45,32),(40,'2004-10-14 09:28:22.726000','1979-08-07 20:14:31.650000','1972-02-28 02:17:56.926000','locust',7381,5042,'Iron III','Xerath',35,35),(41,NULL,NULL,NULL,'Loko',0,0,'Smoko','Boko',NULL,NULL),(42,NULL,NULL,NULL,'loko',0,0,'smoko','boko ',NULL,NULL),(43,NULL,NULL,NULL,'fh',0,0,'lkfhe','lfheq',NULL,NULL),(44,NULL,NULL,NULL,'e',0,0,'j','j',NULL,NULL),(45,'2025-03-14 00:00:00.000000','2023-03-05 00:00:00.000000','2031-03-14 00:00:00.000000','Kikica',2000,1200,'Ptica','Kanarinac',NULL,NULL),(46,'2023-03-18 00:00:00.000000','2023-03-11 00:00:00.000000','2023-03-19 00:00:00.000000','Otica',3000,1200,'Riba','Siva štuka',34,32),(47,'2023-03-11 00:00:00.000000','2016-03-10 00:00:00.000000',NULL,'Oki',1200,1200,'Gazela','Sisavac',34,31),(48,'2023-03-18 00:00:00.000000','2018-03-10 00:00:00.000000','2029-03-09 00:00:00.000000','Otis',21300,1200,'Otis','Otis',32,32),(49,'1979-08-07 00:00:00.000000','1979-08-07 00:00:00.000000','1972-02-28 00:00:00.000000','locust',7381,5042,'Iron II','Xerath',53,32),(50,'1980-07-30 00:00:00.000000','1972-12-04 00:00:00.000000','1992-02-29 00:00:00.000000','Frxy',6877,1324,'Siva vjeverica','Ptica',31,34),(51,'2023-04-08 00:00:00.000000','2019-04-13 00:00:00.000000',NULL,'Zutokljunac',1200,1220,'Kanarinac','Ptice',32,31),(52,'2023-04-14 00:00:00.000000','2023-04-01 00:00:00.000000',NULL,'Frxy',42,42342,'Kanarinac','Ptica',31,32),(53,'2023-04-08 00:00:00.000000','2023-04-01 00:00:00.000000','2023-04-14 00:00:00.000000','Frxy',53453,35354,'Klaun','Riba',31,32),(54,'2023-04-09 00:00:00.000000','2023-04-01 00:00:00.000000',NULL,'Frxy',353,5435,'Ribica','Riba',33,31),(55,'2023-04-23 00:00:00.000000','2023-04-20 00:00:00.000000',NULL,'Frxy',534534,5453,'Piton','Gmaz',34,36),(56,'2023-04-07 00:00:00.000000','2023-04-07 00:00:00.000000',NULL,'Frxy',553,55353,'Papiga','Ptice',48,32),(57,'2023-04-14 00:00:00.000000','2023-04-05 00:00:00.000000',NULL,'frxy',2,42,'lkfew','ldkew',36,35),(58,'2023-04-29 00:00:00.000000','2023-04-07 00:00:00.000000',NULL,'frxy',5435,5345,'kwej','hrwkj',42,32);
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

-- Dump completed on 2023-04-03 14:10:10
