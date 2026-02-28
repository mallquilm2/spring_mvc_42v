package edu.cibertec.spring_mvc_42v.resources.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioDTO {

    private int id;

    @Size(min=3, max = 20, message = "El usuario debe tener entre 3 y 30 caracteres")
    private String usuario;

    @NotNull(message = "La clave no puede ser nula")
    @NotBlank(message = "La clave no puede estar en blanco")
    private String clave;
    private String nombreCompleto;

    private byte[] foto;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id, String usuario, String clave, String nombreCompleto, byte[] foto) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
        this.foto = foto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
