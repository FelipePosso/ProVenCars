package com.deflipe.ProVenCarz.interfaceService;

import com.deflipe.ProVenCarz.modelo.Categoria;

import java.util.List;
import java.util.Optional;

public interface IcategoriaService {
    public List<Categoria>listarCategoria();
    public Optional<Categoria>listarCategoriaId(int catid);
    public int save(Categoria c);
    public void delete(int catid);
}
