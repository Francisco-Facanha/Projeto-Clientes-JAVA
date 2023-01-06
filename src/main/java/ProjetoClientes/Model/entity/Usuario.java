package ProjetoClientes.Model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, name ="Login")
    private String usename;

    @Column(unique = true, name ="e-mail")
    private String mail;

    @Column(name = "Senha")
    private String password;
}


