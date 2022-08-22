
/*
 * Comentarios
 * de varias
 * lineas
 */

CREATE TABLE grupo_42(
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	universidad VARCHAR(50) NOT NULL,
	jornada VARCHAR(10)
);



--INSERTAR DATOS
INSERT INTO grupo_42(universidad, jornada) VALUES("UTP", "Mañana");
INSERT INTO grupo_42(universidad) VALUES("UPB");
INSERT INTO grupo_42(universidad, jornada) VALUES("UTP", "Noche");

--CONSULTAR DATOS
SELECT * FROM grupo_42;
SELECT universidad FROM grupo_42;
SELECT universidad, jornada FROM grupo_42;

--ELIMINAR UN REGISTRO TODOS LOS REGISTROS
DELETE FROM grupo_42;

--ELIMINAR UN REGISTRO EN ESPECIFICO
DELETE FROM grupo_42 WHERE id=2;

--ACTUALIZAR UN REGISTRO
UPDATE grupo_42 SET universidad="Universidad T. Pereira", jornada="Tarde"
WHERE id=1;

--ELIMINAR TABLA
DROP TABLE grupo_42;















