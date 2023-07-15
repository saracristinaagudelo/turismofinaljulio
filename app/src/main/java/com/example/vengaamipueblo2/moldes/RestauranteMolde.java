package com.example.vengaamipueblo2.moldes;

public class RestauranteMolde
{
    private String nombre;
    private String descripcion;
    private String rangoPrecios;
    int foto;

    public RestauranteMolde() { //vacio, dar clic en select none
    }

    public RestauranteMolde(String nombre, String descripcion, String rangoPrecions, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rangoPrecios = rangoPrecios;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRangoPrecios() {
        return rangoPrecios;
    }

    public void setRangoPrecios(String rangoPrecios) {
        this.rangoPrecios = rangoPrecios;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
