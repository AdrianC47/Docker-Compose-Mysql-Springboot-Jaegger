package ec.edu.ups.ServiceForDocker.repositorios;

import ec.edu.ups.ServiceForDocker.entidades.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepositorio extends CrudRepository<Cliente,Long> {
    @Query("select c from Cliente  c where c.cedula=:cedula")
    Cliente findByCedula(String cedula);
}
