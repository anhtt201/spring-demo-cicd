CREATE TABLE `demo_spring_cicd`.`country_codes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO demo_spring_cicd.country_codes (id, code) VALUES(2, '2');