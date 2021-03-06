create table CUSTOMER (
ID bigint(20) not null auto_increment,
ADDRESS_LINE_ONE VARCHAR (100) NOT NULL,
ADDRESS_LINE_TWO VARCHAR (100) NOT NULL,
CITY VARCHAR (50) DEFAULT NULL,
EMAIL VARCHAR (50) DEFAULT NULL,
FIRST_NAME VARCHAR (50) DEFAULT NULL,
LAST_NAME VARCHAR (50) DEFAULT NULL,
PHONE_NUMBER VARCHAR (50) DEFAULT NULL,
STATE VARCHAR (50) DEFAULT NULL,
ZIP_CODE VARCHAR (50) DEFAULT NULL,
PRIMARY KEY (ID)
);

INSERT INTO CUSTOMER(ID, ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, CITY, EMAIL, FIRST_NAME, LAST_NAME, PHONE_NUMBER, STATE, ZIP_CODE)
VALUES(NULL,'Address 1', 'Address 2', 'W-WA','E@mail', 'Jan', 'Kowalski','123456789','PL','15-521');
INSERT INTO CUSTOMER(ID, ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, CITY, EMAIL, FIRST_NAME, LAST_NAME, PHONE_NUMBER, STATE, ZIP_CODE)
VALUES(NULL,'Address 1', 'Address 2', 'W-WA','E@mail', 'Jan', 'Kowalski','123456788','PL','15-522');
INSERT INTO CUSTOMER(ID, ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, CITY, EMAIL, FIRST_NAME, LAST_NAME, PHONE_NUMBER, STATE, ZIP_CODE)
VALUES(NULL,'Address 1', 'Address 2', 'W-WA','E@mail', 'Jan', 'Kowalski','123456787','PL','15-523');
INSERT INTO CUSTOMER(ID, ADDRESS_LINE_ONE, ADDRESS_LINE_TWO, CITY, EMAIL, FIRST_NAME, LAST_NAME, PHONE_NUMBER, STATE, ZIP_CODE)
VALUES(NULL,'Address 1', 'Address 2', 'W-WA','E@mail', 'Jan', 'Kowalski','123456786','PL','15-524');

create table PRODUCT (
                        ID decimal(20) not null auto_increment,
                        DESCRIPTION VARCHAR (100) NOT NULL,
                        PRICE bigint(20) NOT NULL,
                        IMAGE_URL VARCHAR (50) DEFAULT NULL,

);

insert into PRODUCT(ID,DESCRIPTION,PRICE,IMAGE_URL) values ( null,'Great product 1', 20.0,'http://img.com/prodId=1' );
insert into PRODUCT(ID,DESCRIPTION,PRICE,IMAGE_URL) values ( null,'Great product 2', 20.0,'http://img.com/prodId=2' );
insert into PRODUCT(ID,DESCRIPTION,PRICE,IMAGE_URL) values ( null,'Great product 3', 20.0,'http://img.com/prodId=3' );
insert into PRODUCT(ID,DESCRIPTION,PRICE,IMAGE_URL) values ( null,'Great product 4', 20.0,'http://img.com/prodId=4' );