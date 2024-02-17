package com.deflipe.ProVenCarz.modelo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "rol")
public class Rol implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolid")
    private int rolid;

    @Column(name = "roltipo")
    private String roltipo;

    public Rol() {
    }

    public Rol(int rolid, String roltipo) {
        super();
        this.rolid = rolid;
        this.roltipo = roltipo;
    }

    public int getRolid() {
        return rolid;
    }

    public void setRolid(int rolid) {
        this.rolid = rolid;
    }

    public String getRoltipo() {
        return roltipo;
    }

    public void setRoltipo(String roltipo) {
        this.roltipo = roltipo;
    }
}
