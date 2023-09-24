package com.gedai.flowcv.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gedai.flowcv.dtos.EstabelecimentoRecordDto;
import com.gedai.flowcv.models.EstabelecimentoModel;
import com.gedai.flowcv.repositories.EstabelecimentoRepository;

import jakarta.validation.Valid;

import java.util.List;

@RestController
public class EstabelecimentoController {
    
    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    @PostMapping("/estabelecimento")
    public ResponseEntity<EstabelecimentoModel> createEstabelecimento(@RequestBody @Valid EstabelecimentoRecordDto estabelecimentoRecordDto){
        var estabelecimentoModel = new EstabelecimentoModel();
        BeanUtils.copyProperties(estabelecimentoRecordDto, estabelecimentoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(estabelecimentoRepository.save(estabelecimentoModel));
    }

    @GetMapping("/")
    public ResponseEntity<List<EstabelecimentoModel>> getAllEstabelecimento(){
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoRepository.findAll());
    }
}
