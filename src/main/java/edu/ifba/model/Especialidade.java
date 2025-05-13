package edu.ifba.model;

import java.util.UUID;

public class Especialidade {
    private UUID id;
    private String nome;
    
    public Especialidade() {
    }
    public Especialidade(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
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
    
}
