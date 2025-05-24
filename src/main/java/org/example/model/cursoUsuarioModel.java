package org.example.model;

public class cursoUsuarioModel {

    private int id;
    private int usurarioId;
    private int cursoId;
    private String rol;

    public cursoUsuarioModel(int id, int usurarioId, int cursoId, String rol) {
        this.id = id;
        this.usurarioId = usurarioId;
        this.cursoId = cursoId;
        this.rol = rol;
    }

    public cursoUsuarioModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsurarioId() {
        return usurarioId;
    }

    public void setUsurarioId(int usurarioId) {
        this.usurarioId = usurarioId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
