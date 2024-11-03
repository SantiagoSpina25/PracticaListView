package com.example.practicalistview;

import java.util.ArrayList;

public class Campeon {

    private String nombreCampeon;
    private int imagenCampeon;
    private String fechaMundial;

    public Campeon(String nombreCampeon, int imagenCampeon, String fechaMundial){
        this.nombreCampeon = nombreCampeon;
        this.imagenCampeon = imagenCampeon;
        this.fechaMundial = fechaMundial;
    }

    public String getNombreCampeon() {
        return nombreCampeon;
    }

    public void setNombreCampeon(String nombreCampeon) {
        this.nombreCampeon = nombreCampeon;
    }

    public int getImagenCampeon() {
        return imagenCampeon;
    }

    public void setImagenCampeon(int imagenCampeon) {
        this.imagenCampeon = imagenCampeon;
    }

    public String getFechaMundial() {
        return fechaMundial;
    }

    public void setFechaMundial(String fechaMundial) {
        this.fechaMundial = fechaMundial;
    }
}
