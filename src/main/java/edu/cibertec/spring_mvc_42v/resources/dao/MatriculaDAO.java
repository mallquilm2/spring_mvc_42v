package edu.cibertec.spring_mvc_42v.resources.dao;

import edu.cibertec.spring_mvc_42v.resources.dao.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaDAO extends JpaRepository<MatriculaEntity, Integer> {
}
