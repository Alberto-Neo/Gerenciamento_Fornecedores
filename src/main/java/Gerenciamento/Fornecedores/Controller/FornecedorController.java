package Gerenciamento.Fornecedores.Controller;

import Gerenciamento.Fornecedores.Models.FornecedorModel;
import Gerenciamento.Fornecedores.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fonecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public List<FornecedorModel> Lista(){
        return fornecedorService.Listar();
    }

    @GetMapping("/{id}")
    public FornecedorModel Buscar(@PathVariable long id){
        return fornecedorService.Buscar(id);
    }

    @PostMapping
    public FornecedorModel Criar(@RequestBody FornecedorModel fornecedorModel){
        return fornecedorService.Criar(fornecedorModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> Deletar(@PathVariable long id){
        fornecedorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
