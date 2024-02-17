package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.UsuarioRol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IusuarioRol extends CrudRepository<UsuarioRol, Integer> {
}
