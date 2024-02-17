package com.deflipe.ProVenCarz.interfaceService;

import com.deflipe.ProVenCarz.modelo.Rol;
import java.util.List;
import java.util.Optional;

public interface IrolService {
    public List<Rol> listarRol();
    public Optional<Rol> listarRolId(int rolid);
    public int save(Rol r);
    public void delete(int rolid);
}
