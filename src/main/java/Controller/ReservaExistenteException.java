package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ReservaExistenteException extends RuntimeException {
    public ReservaExistenteException() {
        super("Já existe uma reserva para este local nesta data.");
    }
}

