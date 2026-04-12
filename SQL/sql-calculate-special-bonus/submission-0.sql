-- Write your query below
select employee_id , 
CASE 
when employee_id%2=1 AND name Not Like 'M%'
then salary
else 0
End as bonus 
from employees 
ORDER BY employee_id