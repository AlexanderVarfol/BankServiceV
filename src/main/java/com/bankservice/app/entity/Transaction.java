package com.bankservice.app.entity;

import com.bankservice.app.entity.enums.CurrencyCode;
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
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID transaction_id;

    @JoinColumn(name = "debit_account_id")
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {MERGE, PERSIST, REFRESH})
    private Account debitAccount;

    @JoinColumn(name = "credit_account_id")
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {MERGE, PERSIST, REFRESH})
    private Account creditAccount;

    @Column(name = "transaction_type")
    private int type;

    @Column(name = "transaction_amount")
    private String amount;

    @Column(name = "currency_code")
    private CurrencyCode currencyCode;

    @Column(name = "description")
    private char description;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + transaction_id +
                ", debitAccount=" + debitAccount +
                ", creditAccount=" + creditAccount +
                ", type=" + type +
                ", amount='" + amount + '\'' +
                ", description=" + description +
                ", createdAt=" + createdAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transaction_id == that.transaction_id && debitAccount == that.debitAccount && creditAccount == that.creditAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction_id, debitAccount, creditAccount);
    }
}
