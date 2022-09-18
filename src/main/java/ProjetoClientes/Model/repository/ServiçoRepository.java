package ProjetoClientes.Model.repository;

import ProjetoClientes.Model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiçoRepository extends JpaRepository<Servico, Integer> {
}
