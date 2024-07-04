CREATE TABLE employee (
    employee_id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name varchar(255) NOT NULL,
    salary float NOT NULL,
    bankNumber varchar(34) NOT NULL,
    nationalInsuranceNo varchar(9) NOT NULL
);

INSERT INTO employee (name, salary, bankNumber, nationalInsuranceNo) VALUES
("Alison Short", 25000, "98549690", "HN820228C"),
("Lia Vang", 38000, "44925738", "DF735106F"),
("Lance Snyder", 27400, "98712789", "BR936291G"),
("Andy Johnson", 44000, "17581556", "GE277128L"),
("Charley Black", 22000, "81101026", "MN327837D"),
("Aiden Wilkinson", 19000, "37261648", "DN372927D"),
("Caitlin Wade", 92000, "94261402", "PM372615R"),
("Nicolas Coffey", 73500, "41556249", "RJ271962A"),
("Heath Barrera", 27000, "42602296", "AB371029P"),
("Helen Rollins", 45000, "68758766", "TB827165M");
