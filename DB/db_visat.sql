# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_visat
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2021-05-31 15:54:00
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_visat'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_visat" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "db_visat";


#
# Table structure for table 'tbl_admin'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_admin" (
  "admin_id" int(10) unsigned NOT NULL auto_increment,
  "admin_name" varchar(50) NOT NULL,
  "admin_email" varchar(50) NOT NULL,
  "admin_password" varchar(50) NOT NULL,
  PRIMARY KEY  ("admin_id")
) AUTO_INCREMENT=5;



#
# Dumping data for table 'tbl_admin'
#

LOCK TABLES "tbl_admin" WRITE;
/*!40000 ALTER TABLE "tbl_admin" DISABLE KEYS;*/
REPLACE INTO "tbl_admin" ("admin_id", "admin_name", "admin_email", "admin_password") VALUES
	('1','Suraj K S','surajks@gmail.com','Surajks@123');
/*!40000 ALTER TABLE "tbl_admin" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_college'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_college" (
  "college_id" int(10) unsigned NOT NULL auto_increment,
  "college_name" varchar(50) NOT NULL,
  "college_contact" varchar(50) NOT NULL,
  "college_email" varchar(50) NOT NULL,
  "college_address" varchar(50) NOT NULL,
  "college_photo" longtext NOT NULL,
  "college_password" varchar(50) NOT NULL,
  "place_id" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("college_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_college'
#

# No data found.



#
# Table structure for table 'tbl_college_department_chat'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_college_department_chat" (
  "cdc_id" int(10) unsigned NOT NULL auto_increment,
  "cdc_content" varchar(35) NOT NULL,
  "to_college_id" int(10) unsigned NOT NULL default '0',
  "from_college_id" int(10) unsigned NOT NULL default '0',
  "from_department_id" int(11) NOT NULL default '0',
  "cdc_date" varchar(50) NOT NULL,
  PRIMARY KEY  ("cdc_id")
);



#
# Dumping data for table 'tbl_college_department_chat'
#

# No data found.



#
# Table structure for table 'tbl_comment'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_comment" (
  "comment_id" int(10) unsigned NOT NULL auto_increment,
  "comment_content" varchar(200) NOT NULL,
  "comment_date" varchar(50) NOT NULL,
  "post_id" int(10) unsigned NOT NULL,
  "college_id" int(10) unsigned NOT NULL default '0',
  "college_name" varchar(50) NOT NULL default '0',
  "college_photo" longtext NOT NULL,
  "department_id" int(10) unsigned NOT NULL default '0',
  "department_name" varchar(50) NOT NULL default '0',
  "department_photo" longtext NOT NULL,
  "teacher_id" int(10) unsigned NOT NULL default '0',
  "teacher_name" varchar(50) NOT NULL default '0',
  "teacher_photo" longtext NOT NULL,
  "student_id" int(11) NOT NULL default '0',
  "student_name" varchar(50) NOT NULL default '0',
  "student_photo" longtext NOT NULL,
  PRIMARY KEY  ("comment_id")
) AUTO_INCREMENT=14;



#
# Dumping data for table 'tbl_comment'
#

# No data found.



#
# Table structure for table 'tbl_complaint'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_complaint" (
  "complaint_id" int(10) unsigned NOT NULL auto_increment,
  "complaint_content" varchar(50) NOT NULL,
  "complaint_date" varchar(50) NOT NULL,
  "complaint_reply" varchar(50) NOT NULL default 'Not Yet Reply',
  "complaint_reply_date" varchar(50) NOT NULL default '0',
  "complaint_status" int(10) unsigned NOT NULL default '0',
  "college_id" int(10) unsigned NOT NULL default '0',
  "department_id" int(10) unsigned NOT NULL default '0',
  "teacher_id" int(10) unsigned NOT NULL default '0',
  "student_id" int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  ("complaint_id")
);



#
# Dumping data for table 'tbl_complaint'
#

# No data found.



#
# Table structure for table 'tbl_course'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_course" (
  "course_id" int(10) unsigned NOT NULL auto_increment,
  "department_type_id" int(11) NOT NULL,
  "course_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("course_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_course'
#

# No data found.



#
# Table structure for table 'tbl_department'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_department" (
  "department_id" int(10) unsigned NOT NULL auto_increment,
  "department_type_id" int(10) unsigned NOT NULL,
  "department_name" varchar(50) NOT NULL,
  "department_email" varchar(50) NOT NULL,
  "department_contact" varchar(50) NOT NULL,
  "department_password" varchar(50) NOT NULL,
  "department_photo" longtext NOT NULL,
  "department_landmark" varchar(50) NOT NULL,
  "college_id" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("department_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_department'
#

# No data found.



#
# Table structure for table 'tbl_department_chat'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_department_chat" (
  "dc_id" int(10) unsigned NOT NULL auto_increment,
  "dc_content" varchar(50) NOT NULL,
  "dc_date" varchar(50) NOT NULL,
  "to_department_id" int(10) unsigned NOT NULL default '0',
  "from_department_id" int(10) unsigned NOT NULL default '0',
  "from_teacher_id" int(10) unsigned NOT NULL default '0',
  "from_student_id" int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  ("dc_id")
);



#
# Dumping data for table 'tbl_department_chat'
#

# No data found.



#
# Table structure for table 'tbl_department_type'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_department_type" (
  "department_type_id" int(10) unsigned NOT NULL auto_increment,
  "department_type_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("department_type_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_department_type'
#

# No data found.



#
# Table structure for table 'tbl_district'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_district" (
  "district_id" int(10) unsigned NOT NULL auto_increment,
  "district_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("district_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_district'
#

# No data found.



#
# Table structure for table 'tbl_feedback'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_feedback" (
  "feedback_id" int(10) unsigned NOT NULL auto_increment,
  "feedback_content" varchar(50) NOT NULL,
  "feedback_date" varchar(50) NOT NULL,
  "college_id" int(10) unsigned NOT NULL default '0',
  "department_id" int(10) unsigned NOT NULL default '0',
  "teacher_id" int(10) unsigned NOT NULL default '0',
  "student_id" int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  ("feedback_id")
);



#
# Dumping data for table 'tbl_feedback'
#

# No data found.



#
# Table structure for table 'tbl_lectures'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_lectures" (
  "lecture_id" int(10) unsigned NOT NULL auto_increment,
  "teacher_id" int(10) unsigned NOT NULL,
  "subject_id" int(10) unsigned NOT NULL,
  "lecture_content" varchar(100) NOT NULL default '0',
  "lecture_date" varchar(50) NOT NULL,
  "lecture_file" varchar(6666) NOT NULL default '0',
  PRIMARY KEY  ("lecture_id")
) AUTO_INCREMENT=5;



#
# Dumping data for table 'tbl_lectures'
#

# No data found.



#
# Table structure for table 'tbl_like'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_like" (
  "like_id" int(10) unsigned NOT NULL auto_increment,
  "post_id" int(10) unsigned NOT NULL,
  "college_id" int(10) unsigned NOT NULL default '0',
  "college_name" varchar(50) NOT NULL default '0',
  "college_photo" longtext NOT NULL,
  "department_id" int(10) unsigned NOT NULL default '0',
  "department_name" varchar(50) NOT NULL default '0',
  "department_photo" longtext NOT NULL,
  "teacher_id" int(10) unsigned NOT NULL default '0',
  "teacher_name" varchar(50) NOT NULL default '0',
  "teacher_photo" longtext NOT NULL,
  "student_id" int(11) NOT NULL default '0',
  "student_name" varchar(50) NOT NULL default '0',
  "student_photo" longtext NOT NULL,
  PRIMARY KEY  ("like_id")
) AUTO_INCREMENT=249;



#
# Dumping data for table 'tbl_like'
#

# No data found.



#
# Table structure for table 'tbl_place'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_place" (
  "place_id" int(11) NOT NULL auto_increment,
  "district_id" int(10) unsigned NOT NULL,
  "place_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("place_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_place'
#

# No data found.



#
# Table structure for table 'tbl_post'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_post" (
  "post_id" int(10) unsigned NOT NULL auto_increment,
  "post_content" varchar(200) NOT NULL,
  "post_date" varchar(50) NOT NULL,
  "college_id" int(10) unsigned NOT NULL default '0',
  "post_file" longtext,
  "college_name" varchar(50) NOT NULL default '0',
  "college_photo" longtext NOT NULL,
  "department_id" int(10) unsigned NOT NULL default '0',
  "department_name" varchar(50) NOT NULL default '0',
  "department_photo" longtext NOT NULL,
  "teacher_id" int(10) unsigned NOT NULL default '0',
  "teacher_name" varchar(50) NOT NULL default '0',
  "teacher_photo" longtext NOT NULL,
  "student_id" int(11) NOT NULL default '0',
  "student_name" varchar(50) NOT NULL default '0',
  "student_photo" longtext NOT NULL,
  "privacy_status" int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  ("post_id")
) AUTO_INCREMENT=112;



#
# Dumping data for table 'tbl_post'
#

# No data found.



#
# Table structure for table 'tbl_semester'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_semester" (
  "semester_id" int(10) unsigned NOT NULL auto_increment,
  "semester_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("semester_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_semester'
#

# No data found.



#
# Table structure for table 'tbl_student'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_student" (
  "student_id" int(10) unsigned NOT NULL auto_increment,
  "student_name" varchar(50) NOT NULL,
  "student_gender" varchar(50) NOT NULL,
  "student_dob" varchar(50) NOT NULL,
  "student_contact" varchar(50) NOT NULL,
  "student_email" varchar(50) NOT NULL,
  "student_address" varchar(50) NOT NULL,
  "student_photo" longtext NOT NULL,
  "student_password" varchar(50) NOT NULL,
  "place_id" int(10) unsigned NOT NULL,
  "semester_id" int(10) unsigned NOT NULL,
  "department_id" int(10) unsigned NOT NULL,
  "course_id" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("student_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_student'
#

# No data found.



#
# Table structure for table 'tbl_subject'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_subject" (
  "subject_id" int(10) unsigned NOT NULL auto_increment,
  "subject_name" varchar(50) NOT NULL,
  "course_id" int(10) unsigned NOT NULL,
  "semester_id" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("subject_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_subject'
#

# No data found.



#
# Table structure for table 'tbl_teacher'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_teacher" (
  "teacher_id" int(10) unsigned NOT NULL auto_increment,
  "teacher_name" varchar(50) NOT NULL,
  "teacher_dob" varchar(50) NOT NULL,
  "teacher_contact" varchar(50) NOT NULL,
  "teacher_about" varchar(50) NOT NULL,
  "teacher_email" varchar(50) NOT NULL,
  "teacher_gender" varchar(50) NOT NULL,
  "teacher_address" varchar(50) NOT NULL,
  "teacher_photo" longtext NOT NULL,
  "teacher_password" varchar(50) NOT NULL,
  "place_id" int(10) unsigned NOT NULL,
  "department_id" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("teacher_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_teacher'
#

# No data found.



#
# Table structure for table 'tbl_teacher_assign'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_teacher_assign" (
  "assign_id" int(11) NOT NULL auto_increment,
  "teacher_id" int(10) unsigned NOT NULL,
  "subject_id" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("assign_id")
) AUTO_INCREMENT=12;



#
# Dumping data for table 'tbl_teacher_assign'
#

# No data found.

/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
