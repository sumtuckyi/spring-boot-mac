CREATE DATABASE  IF NOT EXISTS `user_directory`;
USE `user_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `user`;




-- Create the 'user' table
CREATE TABLE user (
                      user_seq INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL,
                      id VARCHAR(255) NOT NULL,
                      pw VARCHAR(255) NOT NULL,
                      email1 VARCHAR(255),
                      email2 VARCHAR(255),
                      ph_num VARCHAR(20),
                      zipcode VARCHAR(20),
                      addr1 VARCHAR(255),
                      addr2 VARCHAR(255)
);

-- Insert some dummy data
INSERT INTO user (name, id, pw, email1, email2, ph_num, zipcode, addr1, addr2) VALUES
    ('John Doe', 'john.doe', 'password123', 'john.doe@example.com', null, '1234567890', '12345', 'Street 1', 'Apt 101'),
    ('Jane Smith', 'jane.smith', 'pass321', 'jane.smith@example.com', null, '9876543210', '54321', 'Street 2', 'Apt 202');
