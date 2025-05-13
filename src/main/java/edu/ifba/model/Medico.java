package edu.ifba.model;

import java.util.List;
import java.util.UUID;

public class Medico extends Pessoa{
    private String crm;
    private List<Especialidade> especialidade;
    private Consulta consulta;
    
    public Medico() {
    }
    public Medico(UUID id, String nome, String whatsapp, Endereco endereco, Usuario usuario, Genero genero) {
        super(id, nome, whatsapp, endereco, usuario, genero);
    }
    public Medico(String crm, List<Especialidade> especialidade, Consulta consulta) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.consulta = consulta;
    }
    public Medico(UUID id, String nome, String whatsapp, Endereco endereco, Usuario usuario, Genero genero, String crm,
            List<Especialidade> especialidade, Consulta consulta) {
        super(id, nome, whatsapp, endereco, usuario, genero);
        this.crm = crm;
        this.especialidade = especialidade;
        this.consulta = consulta;
    }
    
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public List<Especialidade> getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(List<Especialidade> especialidade) {
        this.especialidade = especialidade;
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
   
}
