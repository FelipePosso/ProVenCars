package com.deflipe.ProVenCarz.service;

import com.deflipe.ProVenCarz.interfaceService.IusuarioService;
import com.deflipe.ProVenCarz.interfaces.IUsuario;
import com.deflipe.ProVenCarz.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IusuarioService {
    @Autowired
    private IUsuario data;
    @Override
    public List<Usuario> listarUsuario() {
        return (List<Usuario>)data.findAll() ;
    }

    @Override
    public Optional<Usuario> listarUsuarioId(int usuid) {
        return Optional.empty();
    }

    @Override
    public int save(Usuario u) {
        return 0;
    }

    @Override
    public void delete(int usuid) {

    }
}
