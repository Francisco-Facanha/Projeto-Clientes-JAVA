package ProjetoClientes.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

    @NotEmpty(message = "{campo.descricao.obrigatorio}")
    private String descricao;

    @NotEmpty(message = "{campo.data.obrigatorio}")
    private String Data;

    @NotEmpty(message = "{campo.valor.obrigatorio}")
    private String valor;

    @NotNull(message = "{campo.cliente.obrigatorio}")
    private Integer idCliente;

}
