package com.deflipe.ProVenCarz.service;

import com.deflipe.ProVenCarz.interfaceService.IcategoriaService;
import com.deflipe.ProVenCarz.interfaces.ICategoria;
import com.deflipe.ProVenCarz.modelo.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements IcategoriaService {

    @Autowired
    private ICategoria data;
    @Override
    public List<Categoria> listarCategoria() {
        return (List<Categoria>)data.findAll() ;
    }

    @Override
    public Optional<Categoria> listarCategoriaId(int catid) {
        return Optional.empty();
    }

    @Override
    public int save(Categoria c) {
        return 0;
    }

    @Override
    public void delete(int catid) {

    }
}
