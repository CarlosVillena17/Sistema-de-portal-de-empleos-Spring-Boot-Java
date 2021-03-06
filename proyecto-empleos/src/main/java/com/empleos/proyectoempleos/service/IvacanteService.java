package com.empleos.proyectoempleos.service;

import java.util.List;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.empleos.proyectoempleos.model.*;
public interface IvacanteService {
	List<Vacante> buscarTodas(); 
	Vacante buscarPorId(Integer idVacante); 
	void guardar(Vacante vacante);
	List<Vacante> buscarDestacada(); 
	void eliminar(Integer id); 
	List<Vacante> buscarByExample(Example<Vacante> example); 
	Page<Vacante> buscarTodas(Pageable page); 
}
