package ru.netology.jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        List<String> products = entityManager
                .createQuery("SELECT DISTINCT o.productName " +
                        "FROM CustomerOrder o JOIN o.customer c " +
                        "WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))",
                        String.class
                )
                .setParameter("name", name)
                .getResultList();

        return products;
    }
}
