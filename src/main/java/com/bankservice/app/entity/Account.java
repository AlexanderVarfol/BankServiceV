package com.bankservice.app.entity;

import com.bankservice.app.entity.enums.AccountType;
import com.bankservice.app.entity.enums.CurrencyCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @Column(name= "account_id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID account_id;

    @Column(name = "account_name")
    private String name;

    @Column(name = "account_type")
    @Enumerated(value = EnumType.STRING)
    private AccountType type;

    @Column(name = "account_status")
    private Boolean status;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "currency_code")
    private CurrencyCode currencyCode;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @OneToOne(fetch = FetchType.LAZY,cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "client_id" , referencedColumnName = "client_id")
    private Client client;

//    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY,
//            orphanRemoval = true, cascade //= {MERGE, PERSIST, REFRESH})
//    private List<Agreement> agreementList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && client == account.client;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + account_id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", balance=" + balance +
                ", currencyCode=" + currencyCode +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}