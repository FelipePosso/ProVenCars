package com.deflipe.ProVenCarz.service;

import com.deflipe.ProVenCarz.interfaceService.IvehiculoService;
import com.deflipe.ProVenCarz.interfaces.IVehiculo;
import com.deflipe.ProVenCarz.modelo.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService implements IvehiculoService {

    @Autowired
    private IVehiculo data;
    @Override
    public List<Vehiculo> listarVehiculo() {
        return (List<Vehiculo>)data.findAll() ;
    }

    @Override
    public Optional<Vehiculo> listarVehiculoId(String vehplaca) {
        return Optional.empty();
    }

    @Override
    public int save(Vehiculo v) {

        int res=0;
        Vehiculo vehiculo=data.save(v);
        if (!vehiculo.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(String vehplaca) {

    }

    //logica para filtrar catipo
    @Override
    public List<Vehiculo> listarVehiculoPorCategoria(String catipo) {
        return data.findByCategoria_Catipo(catipo);
    }
    //metodo
    @Override
    public List<Vehiculo> findByCategoria_Catipo(String catipo) {
        return null;
    }

    //rango precio
    @Override
    public List<Vehiculo> listarVehiculoPorRangoPrecio(int precioMin, int precioMax) {
        return data.findByVehprecioBetween(precioMin, precioMax);
    }

}
