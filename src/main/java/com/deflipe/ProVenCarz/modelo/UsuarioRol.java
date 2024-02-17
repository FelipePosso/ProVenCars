package com.deflipe.ProVenCarz.modelo;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "usuario_rol")

public class UsuarioRol implements Serializable {

    @EmbeddedId
    private UsuarioRolId id;

    @ManyToOne
    @MapsId("usuid")
    @JoinColumn(name = "usuid", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("rolid")
    @JoinColumn(name = "rolid", insertable = false, updatable = false)
    private Rol rol;

    public UsuarioRol() {
    }

    public UsuarioRol(UsuarioRolId id, Usuario usuario, Rol rol) {
        super();
        this.id = id;
        this.usuario = usuario;
        this.rol = rol;
    }

    public UsuarioRolId getId() {
        return id;
    }

    public void setId(UsuarioRolId id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
