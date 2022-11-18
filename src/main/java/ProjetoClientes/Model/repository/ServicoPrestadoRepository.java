package ProjetoClientes.Model.repository;

import ProjetoClientes.Model.entity.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {
    @Query("select s from ServicoPrestado s join s.Cliente c" +
            "where upper(c.nome) like upper (:nome) and MONTH(s.data) = :mes" )
    List<ServicoPrestado> FindByNomeClienteAndMes(String nome, Integer mes);

}
