package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuario extends CrudRepository<Usuario,Integer> {
    Optional<Usuario> findByUsulogin(String usulogin);

}
