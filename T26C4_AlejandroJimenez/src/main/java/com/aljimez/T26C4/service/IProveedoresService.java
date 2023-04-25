package com.aljimez.T26C4.service;

import java.util.List;

import com.aljimez.T26C4.dto.Proveedores;

public interface IProveedoresService {

	public List<Proveedores> listarProveedores(); // Listar All

	public Proveedores guardarProveedores(Proveedores proveedores); // Guarda un Estudiante CREATE

	public Proveedores actualizarProveedores(Proveedores proveedores); // Actualiza datos del estudiante UPDATE

	Proveedores proveedoresXID(Long id);

	void eliminarProveedores(Long id);

}
