CREATE DATABASE game_library;
USE game_library;

CREATE TABLE genres (id INT AUTO_INCREMENT, ganre VARCHAR(30) UNIQUE , PRIMARY KEY (id));
CREATE TABLE publishers (id INT AUTO_INCREMENT, publisher VARCHAR(30) UNIQUE , PRIMARY KEY (id));
CREATE TABLE review (id INT AUTO_INCREMENT, review VARCHAR(30) UNIQUE , PRIMARY KEY (id));
CREATE TABLE developers (id INT AUTO_INCREMENT, developer VARCHAR(30) UNIQUE , PRIMARY KEY (id));
CREATE TABLE roles_users (id INT AUTO_INCREMENT, roles_users VARCHAR(30) UNIQUE , PRIMARY KEY (id));
CREATE TABLE platforms (id INT AUTO_INCREMENT, name VARCHAR(50) UNIQUE ,PRIMARY KEY (id));

CREATE TABLE games (id INT AUTO_INCREMENT, name VARCHAR (100), relese_day DATE,
            genres_id INT, publishers_id INT, developers_id INT, reviews_id INT, platforms_id INT ,
            PRIMARY KEY (id), FOREIGN KEY (genres_id) REFERENCES genres(id),
            FOREIGN KEY  (publishers_id) REFERENCES publishers(id),
            FOREIGN KEY (developers_id) REFERENCES developers(id),
            FOREIGN KEY (reviews_id) REFERENCES review(id),
            FOREIGN KEY (platforms_id) REFERENCES platforms(id));

CREATE TABLE users (id INT AUTO_INCREMENT, name VARCHAR(30), nickName VARCHAR(30),
            birthday DATE, password VARCHAR(30), mail VARCHAR(50),roles_users_id INT,
            PRIMARY KEY (id), FOREIGN KEY (roles_users_id) REFERENCES roles_users(id));

CREATE TABLE news (id INT AUTO_INCREMENT, name VARCHAR(100), date DATE, text VARCHAR(100000), PRIMARY KEY (id));