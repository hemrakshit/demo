DROP TABLE IF EXISTS student;

CREATE TABLE student (

id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
age INT,
email VARCHAR(50)
);


INSERT INTO student(id, name, age, email) VALUES (11, 'John', 31, 'john@abc.com');
INSERT INTO student(id, name, age, email) VALUES (12, 'Peter', 25, 'peter@abc.com');
INSERT INTO student(id, name, age, email) VALUES (13, 'Maxx', 18, 'max@xyz.com');
commit;