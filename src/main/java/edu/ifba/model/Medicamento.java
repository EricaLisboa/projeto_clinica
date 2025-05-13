package edu.ifba.model;

import java.util.UUID;

public class Medicamento {
    private UUID id;
    private String nome;
    private String posologia;
    
    public Medicamento() {
    }
    
    public Medicamento(UUID id, String nome, String posologia) {
        this.id = id;
        this.nome = nome;
        this.posologia = posologia;
    }

    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosologia() {
        return posologia;
    }
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }
}
