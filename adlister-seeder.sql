USE xanadu_adlister_db;

INSERT INTO users (username, email, password) VALUES
('fred123', 'fred@email.com', 'password'),
  ('cathy123', 'cathy@email.com', 'password'),
  ('sam123', 'sam@email.com', 'password');
INSERT INTO ads (title, user_id, description) VALUES
  ('Toyota Corolla For Sale', 1, 'It runs'),
  ('MacBook Pro For Sale', 1, 'It does not run'),
  ('Cat For Sale', 1, 'He runs a lot');