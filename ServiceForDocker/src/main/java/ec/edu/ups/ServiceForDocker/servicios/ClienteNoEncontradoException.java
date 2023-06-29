package ec.edu.ups.ServiceForDocker.servicios;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente no encontrado!!")
public class ClienteNoEncontradoException  extends RuntimeException{

    public ClienteNoEncontradoException(){

    }

    public ClienteNoEncontradoException(String message){
        super(message);
    }
}
