CREATE TABLE `role`  (
	role_id smallint PRIMARY KEY AUTO_INCREMENT NOT NULL,
    roleType VARCHAR(20) NOT NULL
);

INSERT INTO `role` (roleType) VALUES
("Delivery Employee"),
("Sales Employee");

ALTER TABLE employee
ADD CONSTRAINT FK_employeeRole
FOREIGN KEY (role_id) REFERENCES `role`(role_id);