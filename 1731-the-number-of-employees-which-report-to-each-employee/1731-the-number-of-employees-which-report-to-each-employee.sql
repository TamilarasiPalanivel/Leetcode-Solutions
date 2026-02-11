SELECT 
    h.employee_id,
    h.name,
    COUNT(e.employee_id) AS reports_count,
    ROUND(AVG(e.age)) AS average_age
FROM Employees e
JOIN Employees h
    ON e.reports_to = h.employee_id
GROUP BY h.employee_id, h.name
ORDER BY h.employee_id;
