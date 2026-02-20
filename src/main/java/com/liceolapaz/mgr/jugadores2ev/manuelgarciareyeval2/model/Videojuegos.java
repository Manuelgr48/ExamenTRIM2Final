package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Videojuegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private boolean completado;

    public Videojuegos() {
    }
    public Videojuegos(String titulo, boolean completado) {
        this.titulo = titulo;
        this.completado = false;
    }
    public Videojuegos(int id, String titulo, boolean completado) {
        this.id = id;
        this.titulo = titulo;
        this.completado = false;
    }

    public  String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

