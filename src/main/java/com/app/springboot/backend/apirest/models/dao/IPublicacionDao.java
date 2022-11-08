package com.app.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.backend.apirest.models.entity.Publicacion;

public interface IPublicacionDao extends JpaRepository<Publicacion, Long>{

}
