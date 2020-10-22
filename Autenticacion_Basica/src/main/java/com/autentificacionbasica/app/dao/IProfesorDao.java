package com.autentificacionbasica.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.autentificacionbasica.app.entity.Profesor;

public interface IProfesorDao extends CrudRepository<Profesor, Long> {

}
