-- Create the 'cart' table
CREATE TABLE cart (
    cart_seq INT PRIMARY KEY AUTO_INCREMENT,
    pdt_seq INT NOT NULL,
    count INT NOT NULL,
    user_seq INT NOT NULL,
    FOREIGN KEY (user_seq) REFERENCES user (user_seq) -- Assuming 'user' is the name of your user table
);

-- Insert some dummy data
INSERT INTO cart (pdt_seq, count, user_seq) VALUES
    (1, 3, 1),  -- Assuming product with pdt_seq = 1 exists
    (2, 2, 1),  -- Assuming product with pdt_seq = 2 exists
    (3, 5, 2);  -- Assuming product with pdt_seq = 3 exists
