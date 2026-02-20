package com.JosueChan.Gym.controller;


import com.JosueChan.Gym.Entity.Venta;
import com.JosueChan.Gym.repository.VentaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    private final VentaRepository ventaRepository;

    public VentaController(VentaRepository ventaRepository)
    {this.ventaRepository = ventaRepository;}

    // LISTAR TODOS
    @GetMapping
    public List<Venta> listarTodos(){return ventaRepository.findAll();}

    // CREAR
    @PostMapping
    public Venta crearVenta(@RequestBody Venta venta){return ventaRepository.save(venta);}

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Venta obtenerPorid(@PathVariable Integer id) {return ventaRepository.findById(id).orElse(null);}

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Venta actualizarVenta(@PathVariable Integer id, @RequestBody Venta ventaActualizado){

        return ventaRepository.findById(id).map(venta -> {

            venta.setIdVenta(ventaActualizado.getIdVenta());
            venta.setFechaVenta(ventaActualizado.getFechaVenta());
            venta.setCantidad(ventaActualizado.getCantidad());
            venta.setTotal(ventaActualizado.getTotal());
            venta.setIdEmpleado(ventaActualizado.getIdEmpleado());
            venta.setIdRepuesto(venta.getIdRepuesto());

            return ventaRepository.save(venta);

        }).orElse(null);
    }

    //ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable Integer id){
        ventaRepository.deleteById(id);
        return "Venta eliminado correctamente";
    }

}

