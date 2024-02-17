package com.deflipe.ProVenCarz.interfaceService;

import com.deflipe.ProVenCarz.modelo.DatosPersonales;

import java.util.List;
import java.util.Optional;
public interface IdatosPersonalesService {
    public List<DatosPersonales>listarDatosPersonales();
    public Optional<DatosPersonales>listarDatosPersonalesId(int datid);
    public int save(DatosPersonales dP);
    public void delete(int datid);
}
