package com.gedai.flowcv.repositories;
import com.gedai.flowcv.models.CurriculoModel;
import com.gedai.flowcv.models.EstabelecimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CurriculoRepository extends JpaRepository<CurriculoModel, Integer> {
}
