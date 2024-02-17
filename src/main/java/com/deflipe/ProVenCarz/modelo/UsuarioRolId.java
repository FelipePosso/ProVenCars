package com.deflipe.ProVenCarz.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsuarioRolId implements Serializable{
    @Column(name = "usuid")
    private int usuid;

    @Column(name = "rolid")
    private int rolid;

    public UsuarioRolId() {
    }

    public UsuarioRolId(int usuid, int rolid) {
        super();
        this.usuid = usuid;
        this.rolid = rolid;
    }

    public int getUsuid() {
        return usuid;
    }

    public void setUsuid(int usuid) {
        this.usuid = usuid;
    }

    public int getRolid() {
        return rolid;
    }

    public void setRolid(int rolid) {
        this.rolid = rolid;
    }
}
