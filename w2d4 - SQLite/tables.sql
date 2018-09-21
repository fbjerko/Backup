CREATE TABLE Person (
     person_id INTEGER PRIMARY KEY UNIQUE ,
     first_name text NOT NULL ,
     last_name text NOT NULL,
     address text NOT NULL,
     birtdate text NOT NULL,
     phone_id INTEGER NOT NULL,
     email_id INTEGER NOT NULL,
     FOREIGN KEY(phone_id) REFERENCES Phonenumbers (phone_id) ,
     FOREIGN KEY(email_id) REFERENCES Email (email_id) 
);
CREATE TABLE Family (
     person_id INTEGER UNIQUE ,
     mother text ,
     father text ,
     sibling_1 text ,
     sibling_2 text, 
     child_1 text ,
     child_2 text ,
     friend_1 text ,
     friend_2 text, 
     FOREIGN KEY (person_id) REFERENCES Person (person_id)
);
CREATE TABLE Email (
     email_id INTEGER NOT NULL UNIQUE PRIMARY KEY ,
     email_1 text,
     email_2 text
);
CREATE TABLE Phonenumbers (
     phone_id INTEGER NOT NULL UNIQUE PRIMARY KEY ,
     phonenumber_1 text,
     phonenumber_2 text
);