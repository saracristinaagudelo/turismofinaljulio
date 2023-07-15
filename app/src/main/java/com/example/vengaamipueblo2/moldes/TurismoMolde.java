package com.example.vengaamipueblo2.moldes;

public class TurismoMolde
{
    private int foto;
    private String nombresitio;
    private String preciositio;
    private String telefonositio;

    public TurismoMolde() {
    }

    public TurismoMolde(int foto, String nombresitio, String preciositio, String telefonositio) {
        this.foto = foto;
        this.nombresitio = nombresitio;
        this.preciositio = preciositio;
        this.telefonositio = telefonositio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombresitio() {
        return nombresitio;
    }

    public void setNombresitio(String nombresitio) {
        this.nombresitio = nombresitio;
    }

    public String getPreciositio() {
        return preciositio;
    }

    public void setPreciositio(String preciositio) {
        this.preciositio = preciositio;
    }

    public String getTelefonositio() {
        return telefonositio;
    }

    public void setTelefonositio(String telefonositio) {
        this.telefonositio = telefonositio;
    }
}

