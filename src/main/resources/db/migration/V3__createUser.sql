CREATE TABLE USERS(
    USER_ID int(10) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(20) NOT NULL
);

ALTER TABLE Incidents
    ADD USER_ID int(10),
    ADD CONSTRAINT FK_USER_ID FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);