package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.DatosPersonales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdatosPersonales extends CrudRepository<DatosPersonales,Integer> {
}
