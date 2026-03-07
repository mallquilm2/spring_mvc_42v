package edu.cibertec.spring_mvc_42v.resources.service;

import edu.cibertec.spring_mvc_42v.resources.dao.MatriculaDAO;
import edu.cibertec.spring_mvc_42v.resources.dao.entity.MatriculaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaDAO matriculaDAO;

    public List<MatriculaEntity> listarTodas(){
        return matriculaDAO.findAll();
    }

    public void grabarMatricula(MatriculaEntity me){
        matriculaDAO.save(me);
    }

}
