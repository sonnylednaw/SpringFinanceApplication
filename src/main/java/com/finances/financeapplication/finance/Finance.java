package com.finances.financeapplication.finance;


import javax.persistence.*;
import java.util.Date;

@Table
@Entity
public class Finance {
    @Id
    @SequenceGenerator(
            name = "finance_sequence",
            sequenceName = "finance_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "finance_sequence"
    )
    private Long id;
    private String description;
    private Double amount;
    private Date date;
    private String category;

    public Finance(Long id, String description, Double amount, Date date, String category) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Finance(String description, Double amount, Date date, String category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Finance() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
}

