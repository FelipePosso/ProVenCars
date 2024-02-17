package com.deflipe.ProVenCarz.interfaces;

import com.deflipe.ProVenCarz.modelo.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVehiculo extends CrudRepository<Vehiculo,String> {
    //metodo para service
    List<Vehiculo> findByCategoria_Catipo(String catipo);
    //Rango precio
    List<Vehiculo> findByVehprecioBetween(int precioMin, int precioMax);

}
