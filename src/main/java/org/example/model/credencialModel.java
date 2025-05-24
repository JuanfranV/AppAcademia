package org.example.model;

public class credencialModel {

    private int id;
    private int usuarioId;
    private String contra;

    public credencialModel(int id, int usuarioId, String contra) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.contra = contra;
    }

    public credencialModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
