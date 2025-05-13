package edu.ifba.model;

import java.util.UUID;

public class Paciente extends Pessoa{
    private String planoSaude;
    private Consulta consulta;
    
    public Paciente(String planoSaude, Consulta consulta) {
        this.planoSaude = planoSaude;
        this.consulta = consulta;
    }


    public Paciente(UUID id, String nome, String whatsapp, Endereco endereco, Usuario usuario, Genero genero,
            String planoSaude, Consulta consulta) {
        super(id, nome, whatsapp, endereco, usuario, genero);
        this.planoSaude = planoSaude;
        this.consulta = consulta;
    }

    public Paciente() {
    }


    public String getPlanoSaude() {
        return planoSaude;
    }


    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }


    public Consulta getConsulta() {
        return consulta;
    }


    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
