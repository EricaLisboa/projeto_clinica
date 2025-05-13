package edu.ifba.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Receita {
    private UUID id;
    private LocalDateTime data;
    private String descricao;
    private List<Medicamento> medicamentos;
    
    public Receita(UUID id, LocalDateTime data, String descricao, List<Medicamento> medicamento) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.medicamentos = medicamento;
    }
    
    public Receita() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Medicamento> getMedicamento() {
        return medicamentos;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamentos = medicamento;
    }

   
    
}
