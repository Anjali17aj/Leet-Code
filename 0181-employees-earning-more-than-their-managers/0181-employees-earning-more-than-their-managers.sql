# Write your MySQL query statement below
SELECT e1.Name AS Employee
FROM Employee e1 JOIN Employee e2
ON e1.ManagerID = e2.Id
WHERE e1.Salary > e2.Salary