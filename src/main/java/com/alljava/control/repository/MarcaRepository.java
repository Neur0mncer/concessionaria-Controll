package com.alljava.control.repository;


import com.alljava.control.entities.Marca;
import com.alljava.control.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}