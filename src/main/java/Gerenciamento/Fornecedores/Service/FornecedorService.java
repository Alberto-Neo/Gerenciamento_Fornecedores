package Gerenciamento.Fornecedores.Service;

import Gerenciamento.Fornecedores.Models.FornecedorModel;
import Gerenciamento.Fornecedores.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public List<FornecedorModel> Listar(){
        return fornecedorRepository.findAll();
    }

    public FornecedorModel Buscar(long id){
        return fornecedorRepository.findById(id).get();
    }

    public FornecedorModel Criar(FornecedorModel fornecedorModel){
        return fornecedorRepository.save(fornecedorModel);
    }

    public void deletar(long id){
        fornecedorRepository.deleteById(id);
    }

}
