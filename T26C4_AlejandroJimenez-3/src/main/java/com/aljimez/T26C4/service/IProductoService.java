package com.aljimez.T26C4.service;

import java.util.List;

import com.aljimez.T26C4.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProducto(); // Listar All

	public Producto guardarProducto(Producto producto); // Guarda un departamento CREATE

	public Producto actualizarProducto(Producto producto); // Actualiza datos del departamento UPDATE

	Producto productoXID(Long id);

	void eliminarProducto(Long id);
}
