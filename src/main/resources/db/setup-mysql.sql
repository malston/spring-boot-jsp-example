CREATE DATABASE test;
CREATE USER 'test'@'localhost' IDENTIFIED BY 'secret';
GRANT ALL PRIVILEGES ON test.* TO 'test'@'localhost';
flush privileges;
SHOW GRANTS FOR 'test'@'localhost';
USE test;