package edu.ifba.model;

import java.util.UUID;

public class Endereco {
    private UUID id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;


    public Endereco() {
    }

    public Endereco(UUID id, String rua, String cidade, String estado, String cep) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
       
       
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
       
}
