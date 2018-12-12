USE xanadu_test_db;

DROP TABLE IF EXISTS products;

CREATE TABLE products (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(30),
  price INT UNSIGNED,
  description VARCHAR(1000),
  PRIMARY KEY (id)  
);