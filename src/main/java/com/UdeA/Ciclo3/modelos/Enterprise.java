package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Enterprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="name", unique = true)
    private String name;

    @Column(name="document",unique = true)
    private String document;

    private String phone;

    private String address;

    @OneToMany
    @JoinColumn(name="users")
    private Employee users;

    //@OneToMany
    //@JoinColumn(name="transactions")
    //private Transaction transactions;


    private LocalDate createdAt, updateAt;


 }
