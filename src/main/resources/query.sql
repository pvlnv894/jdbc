select distinct product_name
from sql_agg.orders o
         join sql_agg.customers c on o.customer_id = c.id
where c.name ilike :name;
