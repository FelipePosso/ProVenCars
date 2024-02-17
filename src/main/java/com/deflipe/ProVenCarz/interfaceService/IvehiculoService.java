package com.deflipe.ProVenCarz.interfaceService;

import com.deflipe.ProVenCarz.modelo.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IvehiculoService {
    public List<Vehiculo> listarVehiculo();
    public Optional<Vehiculo> listarVehiculoId(String vehplaca);
    public int save(Vehiculo v);
    public void delete(String vehplaca);
    //metodo par filtrar catiop
    public List<Vehiculo> listarVehiculoPorCategoria(String catipo);
    //metodo por categoria
    List<Vehiculo> findByCategoria_Catipo(String catipo);

    //rango de precios
    public List<Vehiculo> listarVehiculoPorRangoPrecio(int precioMin, int precioMax);
}
