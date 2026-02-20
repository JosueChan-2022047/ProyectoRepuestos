package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Venta;
import com.JosueChan.Gym.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceimplements implements VentaService {
    private final VentaRepository ventaRepository;

    public VentaServiceimplements(VentaRepository ventaRepository){
        this.ventaRepository = ventaRepository;
    }

    @Override
    public List<Venta> getALLVenta() {
        return List.of();
    }

    @Override
    public List<Venta> getAllVenta(){return ventaRepository.findAll(); }

    @Override
    public Venta getVentaById(Integer id){return ventaRepository.findById(id).orElse(null);}

    @Override
    public Venta saveVenta(Venta venta) throws RuntimeException {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta updateVenta(Integer id) {
        return null;
    }

    @Override
    public Venta updateVenta(Integer id, Venta venta) {return null;}

    public void deleteVenta (Integer id){
        ventaRepository.deleteById(id);
    }

}
