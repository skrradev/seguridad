package com.zhanarys.seguridad.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String cardNumber;

    private Double displayOrder;

    private BigDecimal creditLimit;

    private BigDecimal balance;

    private Date dateTime;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "card")
    private Set<Account> accountSet;

    public Set<Account> getAccountSet() {
        return accountSet;
    }
}
