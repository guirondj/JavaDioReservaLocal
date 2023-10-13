package Moradores;

import Reservas.Reserva;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "morador")
    private Set<Reserva> reservas = new HashSet<>();


    // getters e setters
}
