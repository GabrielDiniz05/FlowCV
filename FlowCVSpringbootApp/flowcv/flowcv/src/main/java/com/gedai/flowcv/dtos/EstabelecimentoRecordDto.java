package com.gedai.flowcv.dtos;


import jakarta.validation.constraints.NotBlank;

public record EstabelecimentoRecordDto(@NotBlank String nomeEmpresa, String CNPJ) {
    
}
