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
-- Table structure for table `claim_headers`
--

DROP TABLE IF EXISTS `claim_headers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `claim_headers` (
  `Claim_Header_ID` int(11) NOT NULL,
  `Claim_Status_Code` int(11) NOT NULL,
  `Claim_Type_Code` int(11) NOT NULL,
  `Policy_ID` int(11) NOT NULL,
  `Date_Of_Claim` varchar(30) NOT NULL,
  `Date_Of_Settlement` varchar(30) NOT NULL,
  `Amount_Claimed` int(11) NOT NULL,
  `Amount_Paid` int(11) NOT NULL,
  `Claim_Processing_ID` int(11) NOT NULL,
  `Claim_ID` int(11) NOT NULL,
  PRIMARY KEY (`Claim_Header_ID`),
  KEY `claim_status_code_idx` (`Claim_Status_Code`),
  KEY `claim_type_code_idx` (`Claim_Type_Code`),
  KEY `claim_Processing_Id_idx` (`Claim_Processing_ID`),
  KEY `Policy_Id_idx` (`Policy_ID`),
  KEY `claim_Document_No_idx` (`Claim_ID`),
  CONSTRAINT `Claim_Id` FOREIGN KEY (`Claim_ID`) REFERENCES `claims_document` (`Claim_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `claim_Processing_Id` FOREIGN KEY (`Claim_Processing_ID`) REFERENCES `claims_processing` (`Claim_Processing_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `claim_status_code` FOREIGN KEY (`Claim_Status_Code`) REFERENCES `ref_claim_status` (`Claim_Status_Code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `claim_type_code` FOREIGN KEY (`Claim_Type_Code`) REFERENCES `ref_claim_type` (`Claim_Type_Code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `policy_id` FOREIGN KEY (`Policy_ID`) REFERENCES `policies` (`Policy_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claim_headers`
--

LOCK TABLES `claim_headers` WRITE;
/*!40000 ALTER TABLE `claim_headers` DISABLE KEYS */;
INSERT INTO `claim_headers` VALUES (1,401,101,802,'30-07-2018','20-09-2022',200000,2000,1,1),(2,401,101,804,'25-09-2018','22-02-2020',500000,6000,2,2),(3,401,101,803,'25-08-2018','26-08-2019',600000,50000,3,3),(4,401,101,805,'31-03-2018','20-06-2020',1000000,10000,4,4),(5,401,102,806,'01-03-2017','20-08-2020',300000,30000,5,5);
/*!40000 ALTER TABLE `claim_headers` ENABLE KEYS */;
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
