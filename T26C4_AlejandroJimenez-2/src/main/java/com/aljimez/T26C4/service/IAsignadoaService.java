package com.aljimez.T26C4.service;

import java.util.List;

import com.aljimez.T26C4.dto.Asignadoa;

public interface IAsignadoaService {

	public List<Asignadoa> listarAsignado();

	public Asignadoa guardarAsignado(Asignadoa asignado);

	public Asignadoa actualizarAsignado(Asignadoa asignado);

	void eliminarAsignado(Long id);

	Asignadoa asignadoaXID(Long id);
}
