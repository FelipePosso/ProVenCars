package com.deflipe.ProVenCarz.modelo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuid")
    private int usuid;

    @Column(name = "usulogin")
    private String usulogin;

    @Column(name = "usupassword")
    private String usupassword;

    public Usuario() {
    }

    public Usuario(int usuid, String usulogin, String usupassword) {
        super();
        this.usuid = usuid;
        this.usulogin = usulogin;
        this.usupassword = usupassword;
    }

    public int getUsuid() {return usuid;}
    public void setUsuid(int usuid) {
        this.usuid = usuid;
    }

    public String getUsulogin() {
        return usulogin;
    }

    public void setUsulogin(String usulogin) {
        this.usulogin = usulogin;
    }

    public String getUsupassword() {
        return usupassword;
    }

    public void setUsupassword(String usupassword) {
        this.usupassword = usupassword;
    }


}
