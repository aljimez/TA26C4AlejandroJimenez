package com.aljimez.T26C4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T26C4.dto.Equipos;


public interface IEquipoDAO extends  JpaRepository<Equipos, Long> {

}
