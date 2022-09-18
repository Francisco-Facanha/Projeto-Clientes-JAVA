package ProjetoClientes;

import ProjetoClientes.Model.entity.Cliente;
import ProjetoClientes.Model.repository.Clienterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClienteAplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienteAplication.class, args);
        
    }
}
