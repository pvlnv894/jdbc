package ru.netology.jdbc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders", schema = "sql_agg")
public class CustomerOrder {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private int amount;
}
