package com.uniquindio.android.electiva.el_vozarron.Activities.vo;

/**
 * Created by Alfonso on 18/10/2016.
 */
public class Entrenador {


    private String nombre;
    private String genero;
    private String historial;
    private int foto;


    public Entrenador(String nombre, String genero, String historial, int foto) {
        this.nombre = nombre;
        this.genero = genero;
        this.historial = historial;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
