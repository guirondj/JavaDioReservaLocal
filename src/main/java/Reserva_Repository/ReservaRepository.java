package Reserva_Repository;

import Locais.Local;
import Reservas.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByLocalAndData(Local local, Date data);
}

