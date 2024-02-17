package com.deflipe.ProVenCarz.modelo;

import jakarta.persistence.*;
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catid;

    @Column(name = "catipo")
    private String catipo;

    public Categoria() {
    }

    public Categoria(int catid, String catipo) {
        super();
        this.catid = catid;
        this.catipo = catipo;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getCatipo() {
        return catipo;
    }

    public void setCatipo(String catipo) {
        this.catipo = catipo;
    }
}
