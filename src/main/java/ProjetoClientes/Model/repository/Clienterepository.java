package ProjetoClientes.Model.repository;

import ProjetoClientes.Model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clienterepository extends JpaRepository<Cliente, Integer> {
}
