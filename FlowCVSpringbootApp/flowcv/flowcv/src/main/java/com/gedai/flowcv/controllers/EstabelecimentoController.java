package com.gedai.flowcv.controllers;

import com.gedai.flowcv.dtos.EstabelecimentoRecordDTO;
import com.gedai.flowcv.models.Estabelecimento;
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
    public ResponseEntity<Estabelecimento> saveEstabelecimento(@RequestBody @Valid EstabelecimentoRecordDTO estabelecimentoRecordDTO){
        var estabelecimento = new Estabelecimento();
        BeanUtils.copyProperties(estabelecimentoRecordDTO, estabelecimento);
        return ResponseEntity.status(HttpStatus.CREATED).body(estabelecimentoRepository.save(estabelecimento));
    }

    @GetMapping("/estabelecimentos")
    public ResponseEntity<List<Estabelecimento>> getAllEstabelecimentos(){
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoRepository.findAll());
    }

    @GetMapping("/estabelecimentos/{id}")
    public ResponseEntity<Object> getEstabelecimento(@PathVariable(value = "id") Integer id){
        Optional<Estabelecimento> estabelecimentoOp = estabelecimentoRepository.findById(id);
        if(estabelecimentoOp.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoOp.get());
    }

    @PutMapping("/estabelecimentos/{id}")
    public ResponseEntity<Object> updateEstabelecimento(@PathVariable(value = "id") Integer id, @RequestBody @Valid EstabelecimentoRecordDTO estabelecimentoRecordDTO){

        Optional<Estabelecimento> estabelecimentoOp = estabelecimentoRepository.findById(id);
        if(estabelecimentoOp.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        var estabelecimento = estabelecimentoOp.get();
        BeanUtils.copyProperties(estabelecimentoRecordDTO, estabelecimento);
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoRepository.save(estabelecimento));
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Object> deleteEstabelecimento(@PathVariable(value = "id") Integer id){
        Optional<Estabelecimento> productO = estabelecimentoRepository.findById(id);
        if(productO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        estabelecimentoRepository.delete(productO.get());
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully.");
    }

}
