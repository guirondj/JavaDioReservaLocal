package Controller;

import Reserva_Repository.ReservaRepository;
import Reservas.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    @PostMapping
    public Reserva fazerReserva(@RequestBody Reserva reserva) {
        // Verificar se já existe uma reserva para o local na data especificada
        List<Reserva> reservasExistente = reservaRepository
                .findByLocalAndData(reserva.getLocal(), reserva.getData());
        if (reservasExistente.isEmpty()) {
            return reservaRepository.save(reserva);
        } else {
            // Já existe uma reserva para este local na data especificada
            throw new ReservaExistenteException();
        }
    }
}

