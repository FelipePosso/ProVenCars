package com.deflipe.ProVenCarz.interfaceService;

import com.deflipe.ProVenCarz.modelo.UsuarioRol;

import java.util.List;
import java.util.Optional;

public interface IusuarioRolService {
    public List<UsuarioRol> listarUsuarioRol();
    public Optional<UsuarioRol> listarUsuarioRolId(int usuario);

    public int save(UsuarioRol uR);

    public void delete(int usuario);
}
