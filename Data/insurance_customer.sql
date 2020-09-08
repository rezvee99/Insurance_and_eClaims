-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: insurance
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `Customer_Id` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(60) NOT NULL,
  `Last_Name` varchar(60) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Phone_Number` varchar(20) DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `Pin` int(11) DEFAULT NULL,
  PRIMARY KEY (`Customer_Id`,`Email`),
  UNIQUE KEY `Email_UNIQUE` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Tariqul','Islam','mdrezvee@gmail.com','01815718918','1234',12),(2,'Sharmin','Jahan','sharmin@gmail.com','01815896989','1234',12),(3,'Tariqul','Islam','tariqul@gmail.com','05552552014','1234',12),(4,'Mizanur','Rahman','mizan@gmail.com','01825111111','1234',12),(5,'Tasnim','Mohona','tasnim1@gmail.com','01725111111','1234',12),(6,'Anika','Rahman','anika2@gmail.com','01711223344','1234',12),(7,'Hridoy','Kumar','hridoy@gmail.com','01735223366','1234',12),(8,'Sagor','khan','sagor@gmail.com','01585648752','1234',12),(9,'Md','Al-kafi','kafi@gmail.com','01689856475','1234',12),(10,'Mehedi','Hasan','mehedi@gmail.com','01928643588','1234',12),(11,'Md','Evan','mdevan@gmail.com','01892335566','1234',12),(12,'Md','Sakib','sakib@gmail.com','01864598563','1234',12);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-01 12:06:41
