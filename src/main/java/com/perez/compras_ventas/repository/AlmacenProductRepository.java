package com.perez.compras_ventas.repository;

import com.perez.compras_ventas.entity.AlmacenProducto;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AlmacenProductRepository extends ListCrudRepository<AlmacenProducto, Integer> {

    List<AlmacenProducto> findByAlmacen_Id(Integer almacenId);
}
