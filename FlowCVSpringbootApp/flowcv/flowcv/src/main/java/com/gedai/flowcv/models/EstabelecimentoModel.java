package com.gedai.flowcv.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_estabelecimentos")
public class EstabelecimentoModel{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nomeEmpresa;

    private String CNPJ;

    public int getId() {
        return id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
