package com.aljimez.T26C4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T26C4.dto.Facultad;

public interface IFacultadDAO  extends  JpaRepository<Facultad, Long> {

}
