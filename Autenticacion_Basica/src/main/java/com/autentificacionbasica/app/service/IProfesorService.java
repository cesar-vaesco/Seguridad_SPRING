package com.autentificacionbasica.app.service;

import java.util.List;

import com.autentificacionbasica.app.entity.Profesor;

public interface IProfesorService {

	List<Profesor> findAllProfessors();
}
