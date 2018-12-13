# DROP DATABASE IF EXISTS xanadu_adlister_db;
# CREATE DATABASE xanadu_adlister_db;

# CREATE USER 'xanadu_adlister_user'@'localhost' IDENTIFIED BY 'letmein';
# GRANT ALL ON xanadu_adlister_db.* TO 'xanadu_adlister_user'@'localhost';

USE xanadu_adlister_db;

DROP TABLE IF EXISTS ads;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT UNSIGNED AUTO_INCREMENT,
  username VARCHAR(20) NOT NULL UNIQUE,
  email VARCHAR(255) NOT NULL UNIQUE,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE ads (
  id INT UNSIGNED AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  title VARCHAR(100) NOT NULL,
  description VARCHAR(500),
  FOREIGN KEY (user_id) REFERENCES users (id),
  PRIMARY KEY (id)
);

SHOW DATABASES;

USE xanadu_adlister_db;
SHOW TABLES;


#   +----------+             +-------------+
#   |  users   |             |    ads      |
#   +----------+             +-------------+
#   | id       |<------,     | id          |
#   | username |       `-----| user_id     | <-- foreign key to users table
#   | email    |             | title       |
#   | password |             | description |
#   +----------+             +-------------+
