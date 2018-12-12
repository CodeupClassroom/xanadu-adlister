use xanadu_test_db;

TRUNCATE TABLE products;

INSERT INTO products (name, price, description) VALUES
  ('Widget AA', 200, 'Some widget aa'),
  ('Widget BB', 200, 'Some widget bb'),
  ('Widget CC', 200, 'Some widget cc'),
  ('Widget DD', 200, 'Some widget dd');