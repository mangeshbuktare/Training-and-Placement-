# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     campus_selection_project
# Server version:               5.1.73-community
# Server OS:                    Win32
# HeidiSQL version:             5.0.0.3272
# Date/time:                    2022-05-28 12:06:49
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
# Dumping database structure for campus_selection_project
CREATE DATABASE IF NOT EXISTS `campus_selection_project` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `campus_selection_project`;


# Dumping structure for table campus_selection_project.coordinator
CREATE TABLE IF NOT EXISTS `coordinator` (
  `U_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uname` text,
  `Uaddress` text,
  `UGender` text,
  `Uemail` text,
  `Umobno` text,
  `Upassword` text,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.coordinator: 1 rows
/*!40000 ALTER TABLE `coordinator` DISABLE KEYS */;
INSERT INTO `coordinator` (`U_ID`, `Uname`, `Uaddress`, `UGender`, `Uemail`, `Umobno`, `Upassword`) VALUES (1, 'om', 'pune', 'Male', 'om@gmail.com', '8888888888', '123456');
/*!40000 ALTER TABLE `coordinator` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.dapplied
CREATE TABLE IF NOT EXISTS `dapplied` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) NOT NULL DEFAULT '0',
  `emailid` varchar(50) NOT NULL DEFAULT '0',
  `address` varchar(50) NOT NULL DEFAULT '0',
  `city` varchar(50) NOT NULL DEFAULT '0',
  `zip` varchar(50) NOT NULL DEFAULT '0',
  `mno` varchar(50) NOT NULL DEFAULT '0',
  `cv` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.dapplied: 0 rows
/*!40000 ALTER TABLE `dapplied` DISABLE KEYS */;
/*!40000 ALTER TABLE `dapplied` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.drive
CREATE TABLE IF NOT EXISTS `drive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` longtext NOT NULL,
  `company_email` longtext NOT NULL,
  `company_address` longtext NOT NULL,
  `drive_date` longtext NOT NULL,
  `drive_time` longtext NOT NULL,
  `drive_description` longtext NOT NULL,
  `marks_10` longtext NOT NULL,
  `marks_12` longtext NOT NULL,
  `marks_gd` longtext NOT NULL,
  `marks_pgd` longtext NOT NULL,
  `user_mail_id` longtext NOT NULL,
  `txt_link` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.drive: 1 rows
/*!40000 ALTER TABLE `drive` DISABLE KEYS */;
INSERT INTO `drive` (`id`, `company_name`, `company_email`, `company_address`, `drive_date`, `drive_time`, `drive_description`, `marks_10`, `marks_12`, `marks_gd`, `marks_pgd`, `user_mail_id`, `txt_link`) VALUES (7, 'Inposys', 'info@gmail.com', 'pune', '2022-05-31', '11:00', 'java,sql', '60', '60', '60', '60', 'pratik@gmail.com', 'https://zoom.us/j/7127304366?');
/*!40000 ALTER TABLE `drive` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.drive_info_apply
CREATE TABLE IF NOT EXISTS `drive_info_apply` (
  `S_ID` int(10) NOT NULL AUTO_INCREMENT,
  `D_ID` longtext,
  `Company_Name` longtext,
  `Company_Email_id` longtext,
  `Company_Address` longtext,
  `Drive_Date` longtext,
  `Drive_Time` longtext,
  `email_id` longtext,
  `job_skill` longtext,
  `marks_10` longtext,
  `marks_12` longtext,
  `marks_gd` longtext,
  `marks_pgd` longtext,
  `Status` longtext,
  PRIMARY KEY (`S_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.drive_info_apply: 5 rows
/*!40000 ALTER TABLE `drive_info_apply` DISABLE KEYS */;
INSERT INTO `drive_info_apply` (`S_ID`, `D_ID`, `Company_Name`, `Company_Email_id`, `Company_Address`, `Drive_Date`, `Drive_Time`, `email_id`, `job_skill`, `marks_10`, `marks_12`, `marks_gd`, `marks_pgd`, `Status`) VALUES (1, '5', 'tcs', 'tcs@gmail.com', 'pune', '2022-06-03', '10:00', 'd1@gmail.com', 'java', '85', '85', '85', '85', 'Apply'), (2, '5', 'tcs', 'tcs@gmail.com', 'pune', '2022-06-03', '10:00', 'jitusunsofttech@gmail.com', 'java', '85', '85', '85', '85', 'Apply'), (3, '6', 'IBM', 'ibm@gmail.com', 'pune', '2022-06-06', '11:00', 'd1@gmail.com', 'java,sql', '70', '70', '70', '70', 'Apply'), (4, '6', 'IBM', 'ibm@gmail.com', 'pune', '2022-06-06', '11:00', 'jitusunsofttech@gmail.com', 'java,sql', '75', '80', '85', '65', 'Send'), (5, '7', 'Inposys', 'info@gmail.com', 'pune', '2022-05-31', '11:00', 'jitusunsofttech@gmail.com', 'java,sql', '75', '80', '85', '65', 'Apply');
/*!40000 ALTER TABLE `drive_info_apply` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.drive_info_search
CREATE TABLE IF NOT EXISTS `drive_info_search` (
  `S_ID` int(10) NOT NULL AUTO_INCREMENT,
  `D_ID` longtext,
  `Company_Name` longtext,
  `Company_Email_id` longtext,
  `Company_Address` longtext,
  `Drive_Date` longtext,
  `Drive_Time` longtext,
  `email_id` longtext,
  PRIMARY KEY (`S_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.drive_info_search: 2 rows
/*!40000 ALTER TABLE `drive_info_search` DISABLE KEYS */;
INSERT INTO `drive_info_search` (`S_ID`, `D_ID`, `Company_Name`, `Company_Email_id`, `Company_Address`, `Drive_Date`, `Drive_Time`, `email_id`) VALUES (1, '6', 'IBM', 'ibm@gmail.com', 'pune', '2022-06-06', '11:00', 'jitusunsofttech@gmail.com'), (2, '7', 'Inposys', 'info@gmail.com', 'pune', '2022-05-31', '11:00', 'jitusunsofttech@gmail.com');
/*!40000 ALTER TABLE `drive_info_search` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.hod
CREATE TABLE IF NOT EXISTS `hod` (
  `U_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uname` text,
  `Uaddress` text,
  `UGender` text,
  `Uemail` text,
  `Umobno` text,
  `Upassword` text,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.hod: 1 rows
/*!40000 ALTER TABLE `hod` DISABLE KEYS */;
INSERT INTO `hod` (`U_ID`, `Uname`, `Uaddress`, `UGender`, `Uemail`, `Umobno`, `Upassword`) VALUES (1, 'jitu', 'pune', 'Male', 'jitu@gmail.com', '8888888888', '123456');
/*!40000 ALTER TABLE `hod` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.smarks
CREATE TABLE IF NOT EXISTS `smarks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `semail` varchar(50) DEFAULT NULL,
  `10th` varchar(50) NOT NULL DEFAULT '0',
  `12th` varchar(50) NOT NULL DEFAULT '0',
  `grad` varchar(50) NOT NULL DEFAULT '0',
  `pgrad` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.smarks: 0 rows
/*!40000 ALTER TABLE `smarks` DISABLE KEYS */;
/*!40000 ALTER TABLE `smarks` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.student
CREATE TABLE IF NOT EXISTS `student` (
  `U_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uname` text,
  `Uaddress` text,
  `UGender` text,
  `Uemail` text,
  `Umobno` text,
  `Upassword` text,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.student: 2 rows
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`U_ID`, `Uname`, `Uaddress`, `UGender`, `Uemail`, `Umobno`, `Upassword`) VALUES (1, 'dinesh', 'pune', 'Male', 'd1@gmail.com', '8888888888', '123456'), (2, 'jitu', 'pune', 'Male', 'jitusunsofttech@gmail.com', '8888888888', '123456');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.tbl_external
CREATE TABLE IF NOT EXISTS `tbl_external` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` longtext NOT NULL,
  `company_email` longtext NOT NULL,
  `company_address` longtext NOT NULL,
  `drive_date` longtext NOT NULL,
  `drive_time` longtext NOT NULL,
  `drive_description` longtext NOT NULL,
  `user_mail_id` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.tbl_external: 1 rows
/*!40000 ALTER TABLE `tbl_external` DISABLE KEYS */;
INSERT INTO `tbl_external` (`id`, `company_name`, `company_email`, `company_address`, `drive_date`, `drive_time`, `drive_description`, `user_mail_id`) VALUES (1, 'Function Songs', 'info@gmail.com', 'pune', '2022-06-15', '14:00', 'https://zoom.us/j/7127304366?', 'pratik@gmail.com');
/*!40000 ALTER TABLE `tbl_external` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.tbl_tpo
CREATE TABLE IF NOT EXISTS `tbl_tpo` (
  `U_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uname` text,
  `Uaddress` text,
  `UGender` text,
  `Uemail` text,
  `Umobno` text,
  `Upassword` text,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.tbl_tpo: 1 rows
/*!40000 ALTER TABLE `tbl_tpo` DISABLE KEYS */;
INSERT INTO `tbl_tpo` (`U_ID`, `Uname`, `Uaddress`, `UGender`, `Uemail`, `Umobno`, `Upassword`) VALUES (1, 'pratik', 'pune', 'Male', 'pratik@gmail.com', '8888888888', '123456');
/*!40000 ALTER TABLE `tbl_tpo` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.tbl_trainingprogram
CREATE TABLE IF NOT EXISTS `tbl_trainingprogram` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` longtext NOT NULL,
  `company_email` longtext NOT NULL,
  `company_address` longtext NOT NULL,
  `drive_date` longtext NOT NULL,
  `drive_time` longtext NOT NULL,
  `drive_description` longtext NOT NULL,
  `user_mail_id` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.tbl_trainingprogram: 1 rows
/*!40000 ALTER TABLE `tbl_trainingprogram` DISABLE KEYS */;
INSERT INTO `tbl_trainingprogram` (`id`, `company_name`, `company_email`, `company_address`, `drive_date`, `drive_time`, `drive_description`, `user_mail_id`) VALUES (1, 'java training', 'jp@gmail.com', 'pune', '2022-06-15', '10:00', 'https://zoom.us/j/7127304366?', 'pratik@gmail.com');
/*!40000 ALTER TABLE `tbl_trainingprogram` ENABLE KEYS */;


# Dumping structure for table campus_selection_project.tbl_webinar
CREATE TABLE IF NOT EXISTS `tbl_webinar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` longtext NOT NULL,
  `company_email` longtext NOT NULL,
  `company_address` longtext NOT NULL,
  `drive_date` longtext NOT NULL,
  `drive_time` longtext NOT NULL,
  `drive_description` longtext NOT NULL,
  `user_mail_id` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

# Dumping data for table campus_selection_project.tbl_webinar: 1 rows
/*!40000 ALTER TABLE `tbl_webinar` DISABLE KEYS */;
INSERT INTO `tbl_webinar` (`id`, `company_name`, `company_email`, `company_address`, `drive_date`, `drive_time`, `drive_description`, `user_mail_id`) VALUES (1, 'machine learning', 'info@gmail.com', 'pune', '2022-06-02', '12:00', 'https://zoom.us', 'pratik@gmail.com');
/*!40000 ALTER TABLE `tbl_webinar` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
