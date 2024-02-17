package com.deflipe.ProVenCarz.modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @Column(name = "vehplaca")
    private String vehplaca;

    @ManyToOne
    @JoinColumn(name = "datid")
    private DatosPersonales datosPersonales;

    @ManyToOne
    @JoinColumn(name = "catid")
    private Categoria categoria;

    @Column(name = "vehmodelo")
    private String vehmodelo;

    @Column(name = "vehmarca")
    private String vehmarca;

    @Column(name = "vehestado")
    private String vehestado;

    @Column(name = "vehprecio")
    private int vehprecio;

    public Vehiculo() {
    }

    public Vehiculo(String vehplaca, DatosPersonales datosPersonales, Categoria categoria, String vehmodelo, String vehmarca, String vehestado, int vehprecio) {
        super();
        this.vehplaca = vehplaca;
        this.datosPersonales = datosPersonales;
        this.categoria = categoria;
        this.vehmodelo = vehmodelo;
        this.vehmarca = vehmarca;
        this.vehestado = vehestado;
        this.vehprecio = vehprecio;
    }

    public String getVehplaca() {
        return vehplaca;
    }

    public void setVehplaca(String vehplaca) {
        this.vehplaca = vehplaca;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getVehmodelo() {
        return vehmodelo;
    }

    public void setVehmodelo(String vehmodelo) {
        this.vehmodelo = vehmodelo;
    }

    public String getVehmarca() {
        return vehmarca;
    }

    public void setVehmarca(String vehmarca) {
        this.vehmarca = vehmarca;
    }

    public String getVehestado() {
        return vehestado;
    }

    public void setVehestado(String vehestado) {
        this.vehestado = vehestado;
    }

    public int getVehprecio() {
        return vehprecio;
    }

    public void setVehprecio(int vehprecio) {
        this.vehprecio = vehprecio;
    }
}
