package edu.cibertec.spring_mvc_42v.resources.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioDTO {

    @Size(min=3, max = 20, message = "El usuario debe tener entre 3 y 30 caracteres")
    private String usuario;

    @NotNull(message = "La clave no puede ser nula")
    @NotBlank(message = "La clave no puede estar en blanco")
    private String clave;
    private String nombreCompleto;

    public UsuarioDTO() {
    }
    public UsuarioDTO(String usuario, String clave, String nombreCompleto) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
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
}
