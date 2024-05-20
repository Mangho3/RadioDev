package com.aluracursos.radiodev.modelos;
public class Audio {
    private String titulo;
    private int duracion;
    private int TotalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return TotalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        TotalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproduce(){
        this.TotalDeReproducciones++;
    }
}
