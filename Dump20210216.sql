-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: tasty
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `completed`
--

DROP TABLE IF EXISTS `completed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `completed` (
  `serial` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `startsat` varchar(45) DEFAULT NULL,
  `endsat` varchar(45) DEFAULT NULL,
  `teammates` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`serial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `completed`
--

LOCK TABLES `completed` WRITE;
/*!40000 ALTER TABLE `completed` DISABLE KEYS */;
INSERT INTO `completed` VALUES (1,'ct3','individual','10-10-2020 12:00:00','20-10-2020 12:00:00',''),(3,'ct4','individual','10-11-2020 12:00:00','25-11-2020 12:00:00',''),(6,'project works','individual','01-08-2020 12:00:00','15-12-2020 12:00:00','');
/*!40000 ALTER TABLE `completed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inprogress`
--

DROP TABLE IF EXISTS `inprogress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inprogress` (
  `serial` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `startsAt` varchar(45) DEFAULT NULL,
  `endsAt` varchar(45) DEFAULT NULL,
  `teammates` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`serial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inprogress`
--

LOCK TABLES `inprogress` WRITE;
/*!40000 ALTER TABLE `inprogress` DISABLE KEYS */;
INSERT INTO `inprogress` VALUES (1,'Project Presentation','Individual','01/12/2020 13:15:00','01/12/2020 14:30:00','');
/*!40000 ALTER TABLE `inprogress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('user','user'),('admin','1234'),('fuad','fuad'),('foad','foad'),('daddytkf','01610772131'),('rgt','147'),('kkkk','147'),('kdkdkd','269'),('fghgjgj','123'),('',''),('abdulla','abdulla'),('takla','takla'),('habib','habib'),('rahimmia','rahimmia');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mrtwist`
--

DROP TABLE IF EXISTS `mrtwist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mrtwist` (
  `idmrtwist` int NOT NULL,
  `mrtwistcol` varchar(45) DEFAULT NULL,
  `mrtwistcol1` varchar(45) DEFAULT NULL,
  `mrtwistcol2` varchar(45) DEFAULT NULL,
  `mrtwistcol3` varchar(45) DEFAULT NULL,
  `mrtwistcol4` varchar(45) DEFAULT NULL,
  `mrtwistcol5` varchar(45) DEFAULT NULL,
  `mrtwistcol6` varchar(45) DEFAULT NULL,
  `mrtwistcol7` varchar(45) DEFAULT NULL,
  `mrtwistcol8` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idmrtwist`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mrtwist`
--

LOCK TABLES `mrtwist` WRITE;
/*!40000 ALTER TABLE `mrtwist` DISABLE KEYS */;
/*!40000 ALTER TABLE `mrtwist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `onhold`
--

DROP TABLE IF EXISTS `onhold`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `onhold` (
  `serial` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `startsat` varchar(45) DEFAULT NULL,
  `endsat` varchar(45) DEFAULT NULL,
  `teammates` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`serial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `onhold`
--

LOCK TABLES `onhold` WRITE;
/*!40000 ALTER TABLE `onhold` DISABLE KEYS */;
INSERT INTO `onhold` VALUES (2,'redotest','Individual','ddd','ddddd',''),(8,'redotest','Individual','ddd','ddddd','');
/*!40000 ALTER TABLE `onhold` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studinfo`
--

DROP TABLE IF EXISTS `studinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studinfo` (
  `roll` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `dept` varchar(45) DEFAULT NULL,
  `sem` varchar(10) DEFAULT NULL,
  `grade` varchar(45) DEFAULT NULL,
  `studinfocol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roll`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studinfo`
--

LOCK TABLES `studinfo` WRITE;
/*!40000 ALTER TABLE `studinfo` DISABLE KEYS */;
INSERT INTO `studinfo` VALUES (1,'ishtiak','cse','4','A','44'),(2,'abir','cse','3','A',NULL),(3,'abdulla','eee','2','B',NULL),(6,'fuad','CSE','4','A',NULL),(7,'hoppa','CSE','1','A+',NULL);
/*!40000 ALTER TABLE `studinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `upprogress`
--

DROP TABLE IF EXISTS `upprogress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `upprogress` (
  `serial` int NOT NULL,
  `name` varchar(15) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `startsat` varchar(20) DEFAULT NULL,
  `endsat` varchar(20) DEFAULT NULL,
  `teammates` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`serial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `upprogress`
--

LOCK TABLES `upprogress` WRITE;
/*!40000 ALTER TABLE `upprogress` DISABLE KEYS */;
INSERT INTO `upprogress` VALUES (1,'ct3','Individual','45','56',''),(2,'projectwork','Team work','34','56','fuad,abir,ishtiak.'),(5,'akam','Individual','MMM d, yyyy','MMM d, yyyy','');
/*!40000 ALTER TABLE `upprogress` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-16 21:37:27
