/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.6.49-log : Database - encache-demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`encache-demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `encache-demo`;

/*Table structure for table `DogLeash` */

DROP TABLE IF EXISTS `DogLeash`;

CREATE TABLE `DogLeash` (
  `id` varchar(32) NOT NULL COMMENT 'uuid',
  `color` varchar(64) DEFAULT NULL COMMENT '颜色',
  `variety` varchar(64) DEFAULT NULL COMMENT '品牌',
  `dogId` varchar(32) DEFAULT NULL COMMENT 'dog_id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `DogLeash` */

/*Table structure for table `dog` */

DROP TABLE IF EXISTS `dog`;

CREATE TABLE `dog` (
  `id` varchar(32) NOT NULL COMMENT 'uuid',
  `name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dog` */

insert  into `dog`(`id`,`name`,`age`) values 
('18ea885a8cc54768b7cfea316f8a1ce5','小白',1),
('929968742a06435b866f952af902cb9d','大黄',6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
