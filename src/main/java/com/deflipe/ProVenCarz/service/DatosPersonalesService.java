package com.deflipe.ProVenCarz.service;

import com.deflipe.ProVenCarz.interfaceService.IdatosPersonalesService;
import com.deflipe.ProVenCarz.interfaces.ICategoria;
import com.deflipe.ProVenCarz.interfaces.IdatosPersonales;
import com.deflipe.ProVenCarz.modelo.Categoria;
import com.deflipe.ProVenCarz.modelo.DatosPersonales;
import com.deflipe.ProVenCarz.modelo.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosPersonalesService implements IdatosPersonalesService {

    @Autowired
    private IdatosPersonales data;
    @Override
    public List<DatosPersonales> listarDatosPersonales() {
        return (List<DatosPersonales>)data.findAll() ;
    }

    @Override
    public Optional<DatosPersonales> listarDatosPersonalesId(int datid) {
        return data.findById(datid);
    }

    @Override
    public int save(DatosPersonales dP) {
        int res=0;
        DatosPersonales datosPersonales=data.save(dP);
        if (!datosPersonales.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int datid) {

    }
}
