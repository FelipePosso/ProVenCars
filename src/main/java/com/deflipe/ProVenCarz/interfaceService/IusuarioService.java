package com.deflipe.ProVenCarz.interfaceService;

import com.deflipe.ProVenCarz.modelo.Usuario;
import java.util.List;
import java.util.Optional;

public interface IusuarioService {
    public List<Usuario> listarUsuario();
    public Optional<Usuario> listarUsuarioId(int usuid);
    public int save(Usuario u);
    public void delete(int usuid);
}
