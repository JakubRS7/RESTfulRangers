CREATE TABLE `role`  (
	role_id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    roleType VARCHAR(20) NOT NULL
);

INSERT INTO `role` (roleType) VALUES
("Delivery Employee"),
("Sales Employee");
