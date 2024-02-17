package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoria extends CrudRepository<Categoria,Integer> {
}
