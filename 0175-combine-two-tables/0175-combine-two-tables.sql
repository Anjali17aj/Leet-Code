# Write your MySQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state  #sql command
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personID