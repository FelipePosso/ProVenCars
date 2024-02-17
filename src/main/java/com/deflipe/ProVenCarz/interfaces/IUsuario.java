package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuario extends CrudRepository<Usuario,Integer> {
}
