package ProjetoClientes.rest;

import ProjetoClientes.Model.entity.Cliente;
import ProjetoClientes.Model.entity.ServicoPrestado;
import ProjetoClientes.Model.repository.Clienterepository;
import ProjetoClientes.Model.repository.ServicoPrestadoRepository;
import ProjetoClientes.rest.dto.ServicoPrestadoDTO;
import ProjetoClientes.util.BigDecimalConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/Servicos-Prestados")
@RequiredArgsConstructor


public class ServicoPrestadoController {

    private final Clienterepository clienteRepository;
    private final ServicoPrestadoRepository repository;
    private final BigDecimalConverter bigDecimalConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ServicoPrestado salvar(@RequestBody @Valid ServicoPrestadoDTO dto) {
        LocalDate data = LocalDate.parse(dto.getData(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
        Integer idCliente = dto.getIdCliente();

        Cliente cliente =
                clienteRepository.findById(idCliente).
                        orElseThrow(() -> new ResponseStatusException
                                (HttpStatus.BAD_REQUEST, "Cliente inexistente."));

        ServicoPrestado servicoPrestado = new ServicoPrestado();
        servicoPrestado.setDescricao(dto.getDescricao());
        servicoPrestado.setData(data);
        servicoPrestado.setCliente(cliente);
        servicoPrestado.setValor(BigDecimalConverter.converter(dto.getValor()));

        return repository.save(servicoPrestado);
    }

        @GetMapping
        public List<ServicoPrestado> pesquisar(
                @RequestParam(value = "nome", required = false, defaultValue = "")String nome,
                @RequestParam(value = "mes", required = false)Integer mes
        ){
return repository. FindByNomeClienteAndMes("%" + nome + "%", mes);
    }
}