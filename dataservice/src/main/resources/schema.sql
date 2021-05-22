DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL
);
  DROP TABLE IF EXISTS vehicles;

  CREATE TABLE vehicles (
    id VARCHAR(250)   PRIMARY KEY,
    customerid INT NOT NULL,
    regno VARCHAR(250) NOT NULL,
    status VARCHAR(250) DEFAULT NULL,
    updation TIMESTAMP DEFAULT NULL,
    foreign key (customerid) references customers(id)
  );