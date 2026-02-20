package com.JosueChan.Gym.service;


import com.JosueChan.Gym.Entity.Venta;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VentaService {

    List<Venta> getALLVenta();

    List<Venta> getAllVenta();

    Venta getVentaById(Integer id);

    Venta saveVenta(Venta venta);

    Venta updateVenta(Integer id);

    Venta updateVenta(Integer id, Venta venta);

    void deleteVenta(Integer id);

}
