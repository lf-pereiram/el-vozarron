package com.uniquindio.android.electiva.el_vozarron.Activities.vo;

import java.util.Date;

/**
 * Created by Alfonso on 17/10/2016.
 */
public class Personaje {

        private String nombre;
        private String fechaNacimiento;
        private String url;
        private String entrenador;
        private String ocupacion;
        private int numeroVotos;
        private int foto;
        private boolean estado;


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Personaje(String nombre, String fechaNacimiento, String url, String entrenador, String ocupacion, int numeroVotos, int foto, boolean estado) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.url = url;
        this.entrenador = entrenador;
        this.ocupacion = ocupacion;
        this.numeroVotos = numeroVotos;
        this.foto = foto;
        this.estado=estado;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
}
