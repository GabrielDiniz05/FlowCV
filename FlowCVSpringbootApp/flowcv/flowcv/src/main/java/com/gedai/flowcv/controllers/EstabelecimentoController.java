package com.gedai.flowcv.controllers;

import com.gedai.flowcv.dtos.EstabelecimentoDto;
import com.gedai.flowcv.models.EstabelecimentoModel;
import com.gedai.flowcv.repositories.EstabelecimentoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstabelecimentoController {

    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    @PostMapping("/estabelecimentos")
    public ResponseEntity<EstabelecimentoModel> saveProduct(@RequestBody @Valid EstabelecimentoDto estabelecimentoDto){
        var estabelecimentoModel = new EstabelecimentoModel();
        BeanUtils.copyProperties(estabelecimentoDto, estabelecimentoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(estabelecimentoRepository.save(estabelecimentoModel));
    }

    @GetMapping("/estabelecimentos")
    public ResponseEntity<List<EstabelecimentoModel>> getAllProducts(){
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoRepository.findAll());
    }

    @GetMapping("/estabelecimentos/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable(value = "id") Integer id){
        Optional<EstabelecimentoModel> estabelecimentoO = estabelecimentoRepository.findById(id);
        if(estabelecimentoO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoO.get());
    }

    @PutMapping("/estabelecimentos/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value = "id") Integer id, @RequestBody @Valid EstabelecimentoDto estabelecimentoDto){

        Optional<EstabelecimentoModel> estabelecimentoO = estabelecimentoRepository.findById(id);
        if(estabelecimentoO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não encontrado.");
        }
        var productModel = estabelecimentoO.get();
        BeanUtils.copyProperties(estabelecimentoDto, productModel);
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoRepository.save(productModel));
    }

    @DeleteMapping("/estabelecimentos/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "id") Integer id){
        Optional<EstabelecimentoModel> productO = estabelecimentoRepository.findById(id);
        if(productO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não encontrado.");
        }
        estabelecimentoRepository.delete(productO.get());
        return ResponseEntity.status(HttpStatus.OK).body("Estabelecimento excluído com sucesso.");
    }
}
