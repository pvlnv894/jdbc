--liquibase formatted sql

--changeset pavel:insert-customers
insert into sql_agg.customers (name, surname, age, phone_number) values
                                                                     ('alexey', 'petrov', 34, '89258363492'),
                                                                     ('andrey', 'ivanov', 24, '89253363442'),
                                                                     ('evgenii', 'zhdanov', 36, '89458362783'),
                                                                     ('sergey', 'mukhin', 47, '89258363493');

--changeset pavel:insert-orders
insert into sql_agg.orders (order_date, customer_id, product_name, amount) values
                                                                               ('2026-04-22', 1, 'headphones', 2),
                                                                               ('2026-04-22', 1, 'laptop', 1),
                                                                               ('2026-04-23', 2, 'laptop', 1),
                                                                               ('2026-04-24', 4, 'mouse', 3);
--rollback delete from table;