CREATE TABLE `banco`.`clientes` (
`id` INT NOT NULL,
`nombre` VARCHAR(45) NOT NULL,
`apellidos` VARCHAR(45) NOT NULL,
`num_cuenta` INT NOT NULL,
`balance` DOUBLE NOT NULL,

PRIMARY KEY (`id`),
UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

INSERT INTO banco.clientes VALUES (1,'Abel','MM',42054,43.32);