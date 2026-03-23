package Gerenciamento.Fornecedores.Repository;

import Gerenciamento.Fornecedores.Models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {

}
