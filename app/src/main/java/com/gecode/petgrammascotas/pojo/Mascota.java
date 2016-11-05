package com.gecode.petgrammascotas.pojo;

/**
 * Created by gregorybr on 28-10-16.
 */

public class Mascota {
    private String nombreMascota;
    private int foto;
    private String raiting;

    public Mascota(int foto, String nombreMascota, String raiting ) {
        this.nombreMascota = nombreMascota;
        this.foto = foto;
        this.raiting = raiting;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }
}
