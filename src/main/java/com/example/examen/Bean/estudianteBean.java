package com.example.examen.Bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
public class estudianteBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiante;

    @Column(name = "dni")
    private String DNI;

    private String nombestudiante;

    private String apellipaterno;

    private String apellimaterno;

    private Integer edad;

    private Date fechanacimiento;

    private Boolean estado;

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombestudiante() {
        return nombestudiante;
    }

    public void setNombestudiante(String nombestudiante) {
        this.nombestudiante = nombestudiante;
    }

    public String getApellipaterno() {
        return ;
    }

    public void setApellipaterno(String apellipaterno) {
        this.apellipaterno = apellipaterno;
    }

    public String getApellimaterno() {
        return apellimaterno;
    }

    public void setApellimaterno(String apellimaterno) {
        this.apellimaterno = apellimaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
