package com.deflipe.ProVenCarz.service;

import com.deflipe.ProVenCarz.interfaceService.IrolService;
import com.deflipe.ProVenCarz.interfaces.IRol;
import com.deflipe.ProVenCarz.modelo.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IrolService {
    @Autowired
    private IRol data;
    @Override
    public List<Rol> listarRol() {
        return (List<Rol>)data.findAll() ;
    }

    @Override
    public Optional<Rol> listarRolId(int rolid) {
        return Optional.empty();
    }

    @Override
    public int save(Rol r) {
        return 0;
    }

    @Override
    public void delete(int rolid) {

    }
}
