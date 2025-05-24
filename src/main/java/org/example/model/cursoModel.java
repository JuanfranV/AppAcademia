package org.example.model;

import java.time.LocalDate;

public class cursoModel {

    private int id;
    private int categoriaId;
    private String nombre;
    private String descripcion;
    private LocalDate fechaIncio;
    private LocalDate fechaFin;
    private int participantes;

    public cursoModel(int id, int categoriaId, String nombre, String descripcion, LocalDate fechaIncio, LocalDate fechaFin, int participantes) {
        this.id = id;
        this.categoriaId = categoriaId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.participantes = participantes;
    }

    public cursoModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
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

    public LocalDate getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(LocalDate fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }
}
