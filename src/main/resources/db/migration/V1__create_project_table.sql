CREATE TABLE Project (
    project_Id smallint PRIMARY KEY AUTO_INCREMENT NOT NULL,
    project_name varchar(50),
    project_value decimal(11, 2),
    client_name varchar(30)
);

INSERT INTO Project(project_name, project_value, client_name)
VALUES
("Games Unlimited games", 2000.00, "Tiktok"),
("Hello Kitty Brawlhalla", 1000000.00, "CapCom"),
("New Big Crypto Game", 60000.00, "Company UK");

