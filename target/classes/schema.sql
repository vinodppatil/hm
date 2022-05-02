
DROP TABLE IF EXISTS program;
CREATE TABLE program (
 id INT AUTO_INCREMENT  PRIMARY KEY,
 program_classification VARCHAR(250) NOT NULL,
 program_end_date TIMESTAMP,
 program_name VARCHAR(250) NOT NULL,
 program_start_date TIMESTAMP
);

DROP TABLE IF EXISTS thing;
CREATE TABLE thing (
id INT AUTO_INCREMENT  PRIMARY KEY,
criticality BOOLEAN,
living_type BOOLEAN,
location VARCHAR(250) NOT NULL,
name VARCHAR(250) NOT NULL,
staff_type VARCHAR(250));

DROP TABLE IF EXISTS allocation;
CREATE TABLE allocation (
id INT AUTO_INCREMENT  PRIMARY KEY,
program_id INT,
thing_id INT
);