package Gerenciamento.Fornecedores.Models;

import jakarta.persistence.*;

@Entity(name = "fornecedor")
@Table(name = "tb_fonecedor")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_NomeFantasia")
    private String nomeFantasia;

    @Column(name = "c_CNPJ")
    private String cnpj;

    @Column(name = "c_contato")
    private String contato;


}
