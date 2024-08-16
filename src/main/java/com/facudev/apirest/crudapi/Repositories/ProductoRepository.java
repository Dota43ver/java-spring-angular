package com.facudev.apirest.crudapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facudev.apirest.crudapi.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
