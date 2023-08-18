package com.marcosprado.backendpayment.domain.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "account")
public class Account {

    @Id
    private String AccountSeq;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public Account() {
    }

    public Account(String accountSeq) {
        AccountSeq = accountSeq;
        this.amount = new BigDecimal(0);
        this.createdAt = LocalDateTime.now();
    }

    public String getAccountSeq() {
        return AccountSeq;
    }

    public void setAccountSeq(String accountSeq) {
        AccountSeq = accountSeq;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
