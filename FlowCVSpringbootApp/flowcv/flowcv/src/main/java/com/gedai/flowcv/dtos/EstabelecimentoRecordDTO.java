package com.gedai.flowcv.dtos;

import com.gedai.flowcv.models.Categoria;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public record EstabelecimentoRecordDTO(String razaoSocial, String nomeFantasia, @Email @NotBlank String email, String cnpj, String categoria, Integer cep, Integer numero, String complemento) {
}
