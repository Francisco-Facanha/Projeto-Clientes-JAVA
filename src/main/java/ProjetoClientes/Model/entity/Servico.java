package ProjetoClientes.Model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;

    @Column(nullable = false, length = 150)
    private String  descricao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal valor;

}

