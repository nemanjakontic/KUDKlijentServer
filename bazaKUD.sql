/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 10.4.8-MariaDB : Database - kulturnoumetnickodrustvo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kulturnoumetnickodrustvo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `kulturnoumetnickodrustvo`;

/*Table structure for table `clan` */

DROP TABLE IF EXISTS `clan`;

CREATE TABLE `clan` (
  `brojCK` bigint(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prezime` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pol` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `visina` double(10,1) DEFAULT NULL,
  `datumRodjenja` date DEFAULT NULL,
  `brojObuce` double(10,1) DEFAULT NULL,
  `ansambl` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `datumUclanjenja` date DEFAULT NULL,
  `aktivan` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`brojCK`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `clan` */

insert  into `clan`(`brojCK`,`ime`,`prezime`,`pol`,`visina`,`datumRodjenja`,`brojObuce`,`ansambl`,`datumUclanjenja`,`aktivan`) values 
(63,'Nemanja','Konti','M',184.0,'1997-06-24',43.0,'PRVI','2015-10-09',1),
(65,'Nenad','Vukicevic','Z',130.0,'1920-01-01',30.0,'PRVI','1967-01-01',1),
(66,'Petar','Savic','Z',140.0,'1920-01-01',33.0,'PRVI','1967-05-05',1),
(67,'Milos','dfgdfg','M',130.0,'1920-01-01',30.0,'PRVI','1967-01-01',1),
(68,'Sofija','Milosevic','M',142.0,'1997-01-01',46.0,'PRVI','2019-05-01',0),
(71,'sdfds','fdsfsdfsdfd','Z',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(72,'dfds','fdsfds','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(73,'Sanja','Lukic','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(74,'Marko','Marko','M',190.0,'2010-11-04',49.0,'PRVI','2019-07-02',1),
(75,'Nemanja','Konticccc','M',183.0,'1997-01-01',47.0,'PRVI','2019-01-01',1),
(77,'Milan','Gutesa','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(78,'sdfdsf','sdfdsf','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(79,'sdfdsf','dfsdf','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(80,'dsfdsf','sdfdsfdsf','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(81,'Milos','Cvetkovicddd','M',184.0,'1997-01-01',42.0,'PRVI','2019-04-01',1),
(82,'Nemanja','Zec','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(83,'Dusan','Konticcc','M',186.0,'2002-06-11',46.0,'DECIJI','2018-07-07',0),
(84,'dfdsfdsf','sdfsdf','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(85,'dsf d  sda','sdfsdf','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(86,'dfsdf','sddsfds','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(87,'Dusan','Kontic','M',180.0,'1997-01-01',42.0,'DRUGI','2019-01-01',1),
(88,'fdds','fdsfds','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(89,'misa','misa','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(90,'misa','misaaaa','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1),
(91,'hhhh','hhhhh','M',180.0,'1997-01-01',42.0,'PRVI','2019-01-01',1);

/*Table structure for table `izmeneotpremnice` */

DROP TABLE IF EXISTS `izmeneotpremnice`;

CREATE TABLE `izmeneotpremnice` (
  `rb` int(11) NOT NULL,
  `sifraOtpremnice` bigint(20) NOT NULL,
  `datumIzmene` date DEFAULT NULL,
  `sifraNosnje` int(11) DEFAULT NULL,
  PRIMARY KEY (`rb`,`sifraOtpremnice`),
  KEY `sifraNosnje` (`sifraNosnje`),
  KEY `izmeneotpremnice_ibfk_1` (`sifraOtpremnice`),
  CONSTRAINT `izmeneotpremnice_ibfk_1` FOREIGN KEY (`sifraOtpremnice`) REFERENCES `otpremnica` (`sifraOtpremnice`) ON DELETE CASCADE,
  CONSTRAINT `izmeneotpremnice_ibfk_3` FOREIGN KEY (`sifraNosnje`) REFERENCES `nosnja1` (`sifraNosnje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `izmeneotpremnice` */

insert  into `izmeneotpremnice`(`rb`,`sifraOtpremnice`,`datumIzmene`,`sifraNosnje`) values 
(1,2,'2019-12-25',1),
(1,5,'2019-12-25',2),
(1,7,'2019-12-26',2),
(1,9,'2019-12-26',1),
(1,10,'2019-12-26',1),
(1,11,'2019-12-26',4),
(1,13,'2019-12-26',6),
(1,14,'2020-01-04',3),
(2,2,'2019-12-25',2),
(2,5,'2019-12-25',1),
(2,7,'2019-12-26',2),
(2,9,'2019-12-26',6),
(2,13,'2019-12-26',2),
(2,14,'2020-01-04',7),
(3,2,'2019-12-25',1),
(3,5,'2019-12-25',2),
(3,7,'2019-12-26',2),
(3,9,'2019-12-26',5),
(3,13,'2019-12-26',4),
(3,14,'2020-01-04',4),
(4,7,'2019-12-26',2),
(5,7,'2019-12-26',2),
(6,7,'2019-12-26',2),
(7,7,'2019-12-26',3);

/*Table structure for table `nosnja1` */

DROP TABLE IF EXISTS `nosnja1`;

CREATE TABLE `nosnja1` (
  `sifraNosnje` int(11) NOT NULL AUTO_INCREMENT,
  `vrstaNosnje` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pol` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nazivNosnje` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kolicina` int(11) DEFAULT NULL,
  `opisNosnje` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `vrstaBeline` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `vrstaOpanaka` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `velicina` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sifraNosnje`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `nosnja1` */

insert  into `nosnja1`(`sifraNosnje`,`vrstaNosnje`,`pol`,`nazivNosnje`,`kolicina`,`opisNosnje`,`vrstaBeline`,`vrstaOpanaka`,`velicina`) values 
(1,'BELINA','M','sdfsdf',1,'sdfsdf','MARAMA','null','null'),
(2,'NOSNJA','M','sdfdsfsd',1,'fdsfsdf','null','null','null'),
(3,'NOSNJA','M','neka nosnja',1,'','null','null','null'),
(4,'BELINA','Z','hhhhhh',1,'','MARAMA','null','null'),
(5,'NOSNJA','M','dfsafdsfdfdsfdsfdsfdsfsdf',1,'','null','null','null'),
(6,'BELINA','M','sdfdsf',1,'','MARAMA','null','null'),
(7,'OPANCI','M','dsfds ',1,'','null','SUMADIJSKI','30'),
(8,'OPANCI','M','sdfsdf',1,'','null','SUMADIJSKI','30'),
(9,'NOSNJA','M','sdfsdfds',1,'','null','null','null'),
(10,'BELINA','M','dsfsdfsd',1,'dsfdsfsdf','MARAMA','null','null'),
(11,'BELINA','M','dfdgfgdfg',1,'','MARAMA','null','null'),
(13,'OPANCI','M','dsfdsf',1,'','null','SUMADIJSKI','30'),
(14,'OPANCI','M','dsfsd',1,'','null','SUMADIJSKI','30'),
(15,'NOSNJA','M','dsfsdfdsfsd',1,'','null','null','null'),
(16,'NOSNJA','M','dsfdsfdsf',1,'','null','null','null'),
(17,'NOSNJA','M','dsfsdfsdd',1,'','null','null','null'),
(18,'NOSNJA','M','tttttt',1,'','null','null','null');

/*Table structure for table `otpremnica` */

DROP TABLE IF EXISTS `otpremnica`;

CREATE TABLE `otpremnica` (
  `sifraOtpremnice` bigint(11) NOT NULL AUTO_INCREMENT,
  `datumKreiranja` date DEFAULT NULL,
  `aktivna` tinyint(1) DEFAULT NULL,
  `brojCK` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`sifraOtpremnice`),
  KEY `otpremnica_ibfk_1` (`brojCK`),
  CONSTRAINT `otpremnica_ibfk_1` FOREIGN KEY (`brojCK`) REFERENCES `clan` (`brojCK`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `otpremnica` */

insert  into `otpremnica`(`sifraOtpremnice`,`datumKreiranja`,`aktivna`,`brojCK`) values 
(1,'2019-12-25',1,63),
(2,'2019-12-25',1,63),
(3,'2019-12-25',1,63),
(5,'2019-12-25',0,63),
(7,'2019-12-25',0,67),
(9,'2019-12-26',0,63),
(10,'2019-12-26',1,63),
(11,'2019-12-26',1,63),
(12,'2019-12-26',1,68),
(13,'2019-12-26',0,87),
(14,'2020-01-04',0,63);

/*Table structure for table `stavkaotpremnice` */

DROP TABLE IF EXISTS `stavkaotpremnice`;

CREATE TABLE `stavkaotpremnice` (
  `rb` int(11) NOT NULL,
  `sifraOtpremnice` bigint(20) NOT NULL,
  `kolicina` bigint(11) DEFAULT NULL,
  `sifraNosnje` int(11) DEFAULT NULL,
  PRIMARY KEY (`rb`,`sifraOtpremnice`),
  KEY `sifraOtpremnice` (`sifraOtpremnice`),
  KEY `sifraNosnje` (`sifraNosnje`),
  CONSTRAINT `stavkaotpremnice_ibfk_1` FOREIGN KEY (`sifraOtpremnice`) REFERENCES `otpremnica` (`sifraOtpremnice`) ON DELETE CASCADE,
  CONSTRAINT `stavkaotpremnice_ibfk_2` FOREIGN KEY (`sifraNosnje`) REFERENCES `nosnja1` (`sifraNosnje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `stavkaotpremnice` */

insert  into `stavkaotpremnice`(`rb`,`sifraOtpremnice`,`kolicina`,`sifraNosnje`) values 
(1,2,1,2),
(1,3,1,2),
(1,7,1,4),
(1,10,1,4),
(1,11,1,2),
(1,12,1,2),
(2,2,1,2),
(2,10,1,3),
(2,12,1,2),
(3,2,1,1),
(3,10,1,6),
(3,12,1,2),
(4,12,1,2);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prezime` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `users` */

insert  into `users`(`id`,`ime`,`prezime`,`username`,`password`,`email`) values 
(1,'Pera','Peric','pera','pera','pera@gmail.com'),
(2,'Nemanja ','Kontic','nemanja','nemanja','nemanja@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
