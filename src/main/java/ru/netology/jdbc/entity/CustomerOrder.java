package ru.netology.jdbc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "orders", schema = "sql_agg")
public class CustomerOrder {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "order_date", nullable = false)
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "product_name",nullable = false)
    private String productName;
    @Column(name = "amount", nullable = false)
    private int amount;
}
