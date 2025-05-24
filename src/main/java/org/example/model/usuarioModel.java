package org.example.model;

public class usuarioModel {

    private int id;
    private String nombres;
    private String apellidos;
    private String rol;
    private String email;
    private String telefono;

    public usuarioModel(int id, String nombres, String apellidos, String rol, String email, String telefono) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rol = rol;
        this.email = email;
        this.telefono = telefono;
    }

    public usuarioModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
