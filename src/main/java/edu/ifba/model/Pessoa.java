package edu.ifba.model;

import java.util.UUID;

public abstract class Pessoa {
    private UUID id;
    private String nome;
    private String whatsapp;
    private Endereco endereco;
    private Usuario usuario;
    private Genero genero;
    
    public Pessoa() {
    }
    
    public Pessoa(UUID id, String nome, String whatsapp, Endereco endereco, Usuario usuario, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.whatsapp = whatsapp;
        this.endereco = endereco;
        this.usuario = usuario;
        this.genero = genero;
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
    public String getWhatsapp() {
        return whatsapp;
    }
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}
