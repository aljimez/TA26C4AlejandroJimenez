package com.aljimez.T26C4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T26C4.dto.Ventas;


public interface IVentasDAO extends JpaRepository<Ventas, Long> {

}
