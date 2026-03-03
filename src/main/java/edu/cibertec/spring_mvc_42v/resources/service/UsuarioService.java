package edu.cibertec.spring_mvc_42v.resources.service;

import edu.cibertec.spring_mvc_42v.resources.dao.UsuarioDAO;
import edu.cibertec.spring_mvc_42v.resources.dao.UsuarioDAO_old;
import edu.cibertec.spring_mvc_42v.resources.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioDAO usuarioDAO;

    public UsuarioEntity validarLogin(UsuarioEntity usuario){
        UsuarioEntity rpta = getUsuario(usuario.getUsuario());
        if(rpta == null)
            return rpta;
        if(!rpta.getClave().equalsIgnoreCase(usuario.getClave()))
            rpta = null;
        return rpta;
    }

    public void insertarUsuario(UsuarioEntity usuario){
        usuarioDAO.save(usuario);
    }

    public List<UsuarioEntity> getListaUsuario(){
        return usuarioDAO.findAll();
    }

    public void usuarioEliminar(String codigoUsuario){
         usuarioDAO.deleteById(codigoUsuario);
    }

    public UsuarioEntity getUsuario(String codigo){
        UsuarioEntity rpta = null;
        Optional<UsuarioEntity> busqueda = usuarioDAO.findById(codigo);
        if(busqueda.isPresent())
            rpta=busqueda.get();
        return rpta;
    }

}
