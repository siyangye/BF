--a. find the number of employees in each department
SELECT dept_id, COUNT(id) AS employee_count
FROM Employee
GROUP BY dept_id;

--b. Get the highest salary per department group.
SELECT dept_id, MAX(salary) AS highest_salary
FROM Employee
GROUP BY dept_id;


--c find the employee who have the top salary in each department.
SELECT e.id, e.dept_id, e.salary
FROM Employee e
JOIN (
    SELECT dept_id, MAX(salary) AS highest_salary
    FROM Employee
    GROUP BY dept_id
) AS max_salaries ON e.dept_id = max_salaries.dept_id AND e.salary = max_salaries.highest_salary;
