DROP DATABASE IF EXISTS bijia;
CREATE DATABASE bijia  CHARSET=utf8;
USE bijia;
CREATE TABLE bj_book(
	bookId INT PRIMARY KEY AUTO_INCREMENT,
	bookName VARCHAR(32),
	bookPrice DOUBLE,
	bookWeb VARCHAR(32),
	bookAuthor VARCHAR(32),
	bookPicture VARCHAR(128),
	bookISBN VARCHAR(32),
	bookPubtime VARCHAR(32),
	bookCBS VARCHAR(32)
	
);

SELECT * FROM bj_book;

CREATE TABLE bj_priceUpdate
(
	priceId INT PRIMARY KEY AUTO_INCREMENT,
	bookId INT,
	bookDate VARCHAR(32),
	price DOUBLE
);
SELECT * FROM bj_priceUpdate ;

CREATE TABLE bj_user
(
	userId INT PRIMARY KEY AUTO_INCREMENT,
	userName VARCHAR(32),
	userPwd VARCHAR(32)
);
INSERT INTO bj_user (userName,userPwd) VALUES ('mary','123456');
SELECT * FROM bj_user ;

CREATE TABLE bj_admin
(
	adminId INT PRIMARY KEY AUTO_INCREMENT,
	adminName VARCHAR(32),
	adminPwd VARCHAR(32)
);
INSERT INTO bj_admin (adminName,adminPwd) VALUES ('mary','123456');
INSERT INTO bj_admin (adminName,adminPwd) VALUES ('admin','admin');
SELECT * FROM bj_admin ;
