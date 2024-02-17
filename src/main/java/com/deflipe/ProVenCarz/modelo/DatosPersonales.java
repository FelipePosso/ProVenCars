package com.deflipe.ProVenCarz.modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "datospersonales")
public class DatosPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int datid;

    @ManyToOne
    @JoinColumn(name = "usuid")
    private Usuario usuario;

    @Column(name = "datnombre")
    private String datnombre;

    @Column(name = "datapellido")
    private String datapellido;

    @Column(name = "datipoid")
    private String datipoid;

    @Column(name = "datnumeroid")
    private String datnumeroid;

    @Column(name = "datelefono")
    private String datelefono;

    @Column(name = "datcorreo")
    private String datcorreo;

    public DatosPersonales() {
    }

    public DatosPersonales(int datid, Usuario usuario, String datnombre, String datapellido, String datipoid, String datnumeroid, String datelefono, String datcorreo) {
        super();
        this.datid = datid;
        this.usuario = usuario;
        this.datnombre = datnombre;
        this.datapellido = datapellido;
        this.datipoid = datipoid;
        this.datnumeroid = datnumeroid;
        this.datelefono = datelefono;
        this.datcorreo = datcorreo;
    }

    public int getDatid() {
        return datid;
    }

    public void setDatid(int datid) {
        this.datid = datid;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDatnombre() {
        return datnombre;
    }

    public void setDatnombre(String datnombre) {
        this.datnombre = datnombre;
    }

    public String getDatapellido() {
        return datapellido;
    }

    public void setDatapellido(String datapellido) {
        this.datapellido = datapellido;
    }

    public String getDatipoid() {
        return datipoid;
    }

    public void setDatipoid(String datipoid) {
        this.datipoid = datipoid;
    }

    public String getDatnumeroid() {
        return datnumeroid;
    }

    public void setDatnumeroid(String datnumeroid) {
        this.datnumeroid = datnumeroid;
    }

    public String getDatelefono() {
        return datelefono;
    }

    public void setDatelefono(String datelefono) {
        this.datelefono = datelefono;
    }

    public String getDatcorreo() {
        return datcorreo;
    }

    public void setDatcorreo(String datcorreo) {
        this.datcorreo = datcorreo;
    }
}
