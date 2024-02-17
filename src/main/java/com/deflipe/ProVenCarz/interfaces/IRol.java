package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRol extends CrudRepository<Rol,Integer> {
}
