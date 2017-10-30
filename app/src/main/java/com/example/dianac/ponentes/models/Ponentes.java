package com.example.dianac.ponentes.models;

/**
 * Created by Diana C on 26/10/2017.
 */

public class Ponentes {
    private String titulo;
    private String lugar;
    private String grupo;
    private String fecha;

    public Ponentes(String titulo, String lugar, String grupo, String fecha) {
        this.titulo = titulo;
        this.lugar = lugar;
        this.grupo = grupo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLugar(){
        return lugar;
    }

    public String getGrupo(){
        return grupo;
    }

    public String getFecha(){
        return fecha;
    }
}
