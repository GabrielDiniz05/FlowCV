package com.gedai.flowcv.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gedai.flowcv.models.EstabelecimentoModel;

public interface EstabelecimentoRepository extends JpaRepository<EstabelecimentoModel, UUID>{
    
}
