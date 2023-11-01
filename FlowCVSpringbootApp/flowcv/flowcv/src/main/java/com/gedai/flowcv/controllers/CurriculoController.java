package com.gedai.flowcv.controllers;
import com.gedai.flowcv.dtos.CurriculoDto;
import com.gedai.flowcv.dtos.EstabelecimentoDto;
import com.gedai.flowcv.models.CurriculoModel;
import com.gedai.flowcv.models.EstabelecimentoModel;
import com.gedai.flowcv.repositories.CurriculoRepository;
import com.gedai.flowcv.repositories.EstabelecimentoRepository;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class CurriculoController {
    @Autowired
    CurriculoRepository curriculoRepository;

    @PostMapping("/curriculos")
    public ResponseEntity<CurriculoModel> saveCurriculos(@RequestBody @Valid CurriculoDto curriculoDto){
        var curriculoModel = new CurriculoModel();
        BeanUtils.copyProperties(curriculoDto, curriculoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(curriculoRepository.save(curriculoModel));
    }

    @GetMapping("/curriculos")
    public ResponseEntity<List<CurriculoModel>> getAllCurriculos(){
        return ResponseEntity.status(HttpStatus.OK).body(curriculoRepository.findAll());
    }

    @GetMapping("/curriculos/{id}")
    public ResponseEntity<Object> getCurriculos(@PathVariable (value = "id")Integer id){
        Optional<CurriculoModel> curriculo0 = curriculoRepository.findById(id);
        if(curriculo0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curriculo não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(curriculo0.get());
    }

    @PutMapping("/curriculos/{id}")
    public ResponseEntity<Object> updateCurriculos(@PathVariable(value = "id") Integer id, @RequestBody @Valid CurriculoDto curriculoDto){
        Optional<CurriculoModel> curriculo0 = curriculoRepository.findById(id);
        if(curriculo0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curriculos não encontrado.");
        }
        var curriculoModel = curriculo0.get();
        BeanUtils.copyProperties(curriculoDto, curriculoModel);
        return ResponseEntity.status(HttpStatus.OK).body(curriculoRepository.save(curriculoModel));
    }

    @DeleteMapping("/curriculos/{id}")
    public ResponseEntity<Object> deleteCurriculos(@PathVariable(value = "id") Integer id){
        Optional<CurriculoModel> curriculo0 = curriculoRepository.findById(id);
        if(curriculo0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curriculo não encontrado.");
        }
        curriculoRepository.delete(curriculo0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Curriculo excluido com sucesso.");
    }
}
