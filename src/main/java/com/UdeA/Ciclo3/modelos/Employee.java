package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="email", unique = true)
    private String email;

    private Enum_RolName rol;

    //@OneToOne
    //@JoinColumn(name="profile")
    //private Profile profile;

    //### aca voy a iniciar la inyeccion de dependencias ######
    // las dependencias se inyectan trayendo el metodo e instanciandolo y se lo coloca la anotacion
    //para que springboot sepa que tiene que hacer con el
    // ejm: @OnetoMany y luego las instancia del metodo
    @ManyToOne()
    @JoinColumn(name="enterprise")
    private Enterprise enterprise;

   // @OneToMany
    //@JoinColumn(name="transactions")
    //private Transaction transactions;

    private LocalDateTime createdAt, updateAt;

}