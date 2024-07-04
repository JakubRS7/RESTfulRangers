CREATE TABLE employee (
    employee_id smallint PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name varchar(255) NOT NULL,
    salary float NOT NULL,
    bankNumber varchar(34) NOT NULL,
    nationalInsuranceNo varchar(9) NOT NULL,
    role_id smallint
);

INSERT INTO employee (name, salary, bankNumber, nationalInsuranceNo, role_id) VALUES
("Alison Short", 25000, "98549690", "HN820228C", 1 ),
("Lia Vang", 38000, "44925738", "DF735106F", 1),
("Lance Snyder", 27400, "98712789", "BR936291G", 1),
("Andy Johnson", 44000, "17581556", "GE277128L", 2),
("Charley Black", 22000, "81101026", "MN327837D", 1),
("Aiden Wilkinson", 19000, "37261648", "DN372927D", 1),
("Caitlin Wade", 92000, "94261402", "PM372615R", 2),
("Nicolas Coffey", 73500, "41556249", "RJ271962A", 2),
("Heath Barrera", 27000, "42602296", "AB371029P", 1),
("Helen Rollins", 45000, "68758766", "TB827165M", 1);
