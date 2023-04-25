package com.aljimez.T26C4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T26C4.dto.Producto;


public interface IProductoDAO extends JpaRepository<Producto, Long> {

}
