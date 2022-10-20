package com.example.examen.Bean;

import javax.persistence.*;

@Entity
@Table(name = "matricula")
public class matriculaBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmatricula;

    private Integer idestudiante;

    private Integer ;

    public Integer getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(Integer idmatricula) {
        this.idmatricula = idmatricula;
    }

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Integer getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(Integer idcursos) {
        this.idcursos = idcursos;
    }
}
