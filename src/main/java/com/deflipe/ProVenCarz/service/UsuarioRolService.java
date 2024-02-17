package com.deflipe.ProVenCarz.service;

import com.deflipe.ProVenCarz.interfaceService.IusuarioRolService;
import com.deflipe.ProVenCarz.interfaces.IusuarioRol;
import com.deflipe.ProVenCarz.modelo.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioRolService implements IusuarioRolService {
    @Autowired
    private IusuarioRol data;
    @Override
    public List<UsuarioRol> listarUsuarioRol() {
        return (List<UsuarioRol>)data.findAll();
    }

    @Override
    public Optional<UsuarioRol> listarUsuarioRolId(int rol) {
        return Optional.empty();
    }

    @Override
    public int save(UsuarioRol uR) {
        return 0;
    }

    @Override
    public void delete(int rol) {

    }
}
