DROP TABLE IF EXISTS asignado;
DROP TABLE IF EXISTS cientifico;
DROP TABLE IF EXISTS proyecto;


CREATE TABLE IF NOT EXISTS cientifico (
id INT AUTO_INCREMENT,
dni VARCHAR(8) DEFAULT NULL,
nomApels VARCHAR(255) DEFAULT NULL,
PRIMARY KEY(id)
);
					
CREATE TABLE IF NOT EXISTS proyecto (
id INT AUTO_INCREMENT,
nombre VARCHAR(255) DEFAULT NULL,
horas INT DEFAULT NULL,
PRIMARY KEY(id)
);
						
CREATE TABLE IF NOT EXISTS asignado (
id INT AUTO_INCREMENT,
cientifico INT,
proyecto INT,
PRIMARY KEY(id),
KEY(cientifico, proyecto),
CONSTRAINT cientifico_fk FOREIGN KEY (cientifico) REFERENCES cientifico (id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT proyecto_fk FOREIGN KEY (proyecto) REFERENCES proyecto (id)
ON DELETE CASCADE ON UPDATE CASCADE
);
						
					
INSERT INTO cientifico (dni, nomApels) VALUES ('1234769678', 'Jose Marin');
INSERT INTO cientifico (dni, nomApels) VALUES ('2342784489', 'Francisco Parra');
INSERT INTO cientifico (dni, nomApels) VALUES ('34567890', 'Alberto Del Pozo');



INSERT INTO proyecto (nombre, horas) VALUES ('Desarrollo IA', 1000);
INSERT INTO proyecto (nombre, horas) VALUES ('Diseño Web', 20);
INSERT INTO proyecto (nombre, horas) VALUES ('Safein', 300);



INSERT INTO asignado (cientifico, proyecto) VALUES (2, 2);
INSERT INTO asignado (cientifico, proyecto) VALUES (1, 1);
INSERT INTO asignado (cientifico, proyecto) VALUES (3, 2);
