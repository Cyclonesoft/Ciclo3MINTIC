package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String concept;
    private Float amount;

    //@ManyToOne
    //@JoinColumn(name="user")
    //private Employee user;

    //@ManyToOne
    //@JoinColumn(name="enterprise")
    //Enterprise enterprise;

    private LocalDate createdAt, updateAt;


}
