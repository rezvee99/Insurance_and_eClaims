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
-- Table structure for table `claims_processing`
--

DROP TABLE IF EXISTS `claims_processing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `claims_processing` (
  `Claim_Processing_ID` int(11) NOT NULL,
  `Claim_ID` int(11) NOT NULL,
  `Claim_Outcome_Code` int(11) NOT NULL,
  `Claim_Stage_ID` int(11) NOT NULL,
  `Staff_ID` int(11) NOT NULL,
  PRIMARY KEY (`Claim_Processing_ID`),
  KEY `claim_Outcome_Code_idx` (`Claim_Outcome_Code`),
  KEY `Staff_Id_idx` (`Staff_ID`),
  KEY `claim_Stage_id_idx` (`Claim_Stage_ID`),
  KEY `claim_Id_idx` (`Claim_ID`),
  CONSTRAINT `Staff_Id` FOREIGN KEY (`Staff_ID`) REFERENCES `staff` (`Staff_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `claimId` FOREIGN KEY (`Claim_ID`) REFERENCES `claims_document` (`Claim_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `claim_Outcome_Code` FOREIGN KEY (`Claim_Outcome_Code`) REFERENCES `ref_stage_outcomes` (`Claim_Outcome_Code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `claim_stage_id` FOREIGN KEY (`Claim_Stage_ID`) REFERENCES `claims_processing_stages` (`Claim_Stage_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claims_processing`
--

LOCK TABLES `claims_processing` WRITE;
/*!40000 ALTER TABLE `claims_processing` DISABLE KEYS */;
INSERT INTO `claims_processing` VALUES (1,1,201,1,2),(2,2,201,1,6),(3,3,201,1,2),(4,4,201,1,5),(5,5,201,1,1);
/*!40000 ALTER TABLE `claims_processing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-01 12:06:42
