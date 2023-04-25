package com.aljimez.T26C4.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T26C4.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas,Long>{

	Optional<Piezas> findById(int id);


}
