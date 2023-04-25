CREATE DATABASE tienda;
USE tienda;
DROP TABLE  IF EXISTS piezas;
DROP TABLE IF EXISTS proveedores;
DROP TABLE IF EXISTS suministra;

CREATE TABLE piezas (
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE proveedores (
    id int NOT NULL,
    nombre VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE suministra (
    piezas_id INT NOT NULL,
    proveedores_id int NOT NULL,
    precio INT NOT NULL,
    PRIMARY KEY(piezas_id, proveedores_id),
    
    CONSTRAINT FK_piezas FOREIGN KEY (piezas_id) REFERENCES piezas (id)
        ON UPDATE CASCADE ON DELETE CASCADE,
        
    CONSTRAINT FK_proveedores FOREIGN KEY (proveedores_id) REFERENCES proveedores (id)
        ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO piezas (nombre) VALUES ('Tuerca');
INSERT INTO piezas (nombre) VALUES ('Piston');

INSERT INTO proveedores (id,nombre) VALUES (1,'Honda');
INSERT INTO proveedores (id,nombre) VALUES (2,'Bosch');

INSERT INTO suministra (piezas_id, proveedores_id, precio) VALUES (1, 2, 20);
INSERT INTO suministra (piezas_id, proveedores_id, precio) VALUES (2, 2, 32);

SELECT * FROM suministra;
SELECT * FROM proveedores;
SELECT * FROM piezas;
