
SELECT * FROM employees;

--PUNTO 1
SELECT last_name, salary 
FROM employees 
WHERE salary > 12000;

--PUNTO 2:
/*
*Cree un informe que muestre el apellido y el número de departamento 
*para el número de empleado 176.
*/
SELECT last_name, department_id
FROM employees
WHERE employee_id = 176;

--PUNTO 3:
/*
*Crea un informe para mostrar el apellido y el salario 
*de cualquier empleado cuyo salario no esté 
*en el rango de $ 5.000 a $ 12.000
*/
SELECT last_name, salary 
FROM employees 
WHERE NOT(salary >= 5000 AND salary <= 12000);


SELECT last_name, salary 
FROM employees
WHERE NOT salary BETWEEN 5000 AND 12000;

--PUNTO 4
/*
 * Cree un informe para mostrar el apellido, 
 * la identificación del trabajo y la fecha de contratación 
 * para los empleados con los apellidos de Matos y Taylor
 */
SELECT last_name, job_id, hire_date 
FROM employees
WHERE last_name="Chen" OR last_name="Taylor" 
ORDER BY hire_date ASC;



--ORDENAR DE FORMA ASCENDENTE
SELECT last_name, salary 
FROM employees 
ORDER BY salary ASC;

--ORDENAR DE FORMA DESCENDENTE
SELECT last_name, salary 
FROM employees 
ORDER BY salary DESC;

--PUNTO 5

SELECT last_name, department_id 
FROM employees
WHERE department_id = 6 OR department_id = 10
ORDER BY first_name ASC;



--PUNTO 6:
/*
 * Crea un informe para mostrar el apellido 
 * y el salario de los empleados que ganan entre $ 5.000 y $ 12.000, 
 * y están en el departamento 6 o 10. 
 * Etiquete las columnas apellido como Employee y
 * salary como 'Monthly Salary'.
 */

SELECT last_name AS "Employee", salary  AS "Monthly Salary"
FROM employees 
WHERE (salary BETWEEN 5000 AND 12000) AND (department_id = 6 OR department_id  = 10);

--PUNTO 7
/*
 * Generar un informe que muestre el apellido y la fecha de contratación 
 * de todos los empleados que fueron contratados en 1994.
 */
SELECT last_name, hire_date 
FROM employees 
WHERE hire_date  like '%1994%';


SELECT last_name, hire_date
FROM employees
WHERE hire_date LIKE '%94%';

--PUNTO 8
/*
 * Cree un informe para mostrar el apellido y el id del trabajo (job_id) 
 * de todos los empleados que no tienen un gerente
 */
SELECT last_name, job_id
FROM employees
WHERE manager_id IS NULL;

SELECT last_name, job_id
FROM employees 
WHERE manager_id   IS  NULL;


SELECT e.last_name, j.job_title 
FROM employees e 
INNER JOIN jobs j 
ON e.job_id = j.job_id 
WHERE manager_id   IS  NULL;




---USO DE 'alias'
SELECT first_name AS nombre, last_name AS apellido 
FROM employees;

SELECT first_name nombre, last_name apellido 
FROM employees;

SELECT first_name "nombre", last_name "primer apellido" 
FROM employees;

--Obtener a todas las personas que empiezan por 'D'
SELECT first_name 
FROM employees 
WHERE first_name LIKE 'D%';

--Obtener a todas las personas que terminan en 'D'
SELECT first_name 
FROM employees 
WHERE first_name LIKE '%D';

--Obtener a todas las personas que tengan 'D' en su nombre
SELECT first_name 
FROM employees 
WHERE first_name LIKE '%D%';

--Obtener los registros que tengan null en el campo telefono
SELECT * FROM employees 
WHERE phone_number IS NULL;

--Obtener los registros que no tengan null en el campo telefono
SELECT * FROM employees 
WHERE phone_number IS NOT NULL;

