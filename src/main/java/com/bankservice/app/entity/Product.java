package com.bankservice.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID product_id;

    @Column(name = "name")
    private String name;

    @JoinColumn(name = "manager_id")
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {MERGE, PERSIST, REFRESH})
    private Manager manager;

    @Column(name = "product_status")
    private int status;

    @Column(name = "currency_code")
    private int currencyCode;

    @Column(name = "interest_rate")
    private int interestRate;

    @Column(name = "product_limit")
    private int limit;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + product_id +
                ", name='" + name + '\'' +
                ", managerId=" + manager +
                ", status=" + status +
                ", currencyCode=" + currencyCode +
                ", interestRate=" + interestRate +
                ", limit=" + limit +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return product_id == product.product_id && manager == product.manager && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, name, manager);
    }
}
