package ec.edu.ups.ServiceForDocker.servicios;

import ec.edu.ups.ServiceForDocker.entidades.Cliente;
import ec.edu.ups.ServiceForDocker.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> findAll(){
        return (List<Cliente>) clienteRepositorio.findAll();
    }

    public Cliente obtenerClienteByCedula (String cedula){
        return(Cliente)clienteRepositorio.findByCedula(cedula);
    }

    public void save (Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    public void delete(long codigo){
        clienteRepositorio.deleteById(codigo);
    }
}
