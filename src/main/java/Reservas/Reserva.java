package Reservas;

import Locais.Local;
import Moradores.Morador;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Morador morador;

    @ManyToOne
    private Local local;

    @Temporal(TemporalType.DATE)
    private Date data;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    // getters e setters
}

