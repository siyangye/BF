SELECT e.employee_id, e.name, s.effective_date, s.salary
FROM Employee e
JOIN Salary s
    ON e.employee_id = s.employee_id
WHERE s.effective_date = (
    SELECT MAX(s1.effective_date)
    FROM Salary s1
    WHERE s1.employee_id = s.employee_id
);
