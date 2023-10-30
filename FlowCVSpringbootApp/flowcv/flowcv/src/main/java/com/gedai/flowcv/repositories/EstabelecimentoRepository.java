package com.gedai.flowcv.repositories;

import com.gedai.flowcv.models.EstabelecimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<EstabelecimentoModel, Integer> {
}
