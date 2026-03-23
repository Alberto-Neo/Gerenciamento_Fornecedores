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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
