package com.JosueChan.Gym.controller;

import com.JosueChan.Gym.Entity.Repuesto;
import com.JosueChan.Gym.repository.RepuestoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Repuestos")
public class RepuestoController {

    private final RepuestoRepository repuestoRepository;

    public RepuestoController(RepuestoRepository repuestoRepository) {
        this.repuestoRepository = repuestoRepository;
    }

    // LISTAR TODOS
    @GetMapping
    public List<Repuesto> listarTodos() {
        return repuestoRepository.findAll();
    }

    // CREAR
    @PostMapping
    public Repuesto crearRepuesto(@RequestBody Repuesto repuesto) {
        return repuestoRepository.save(repuesto);
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Repuesto obtenerPorId(@PathVariable Integer id){
        return repuestoRepository.findById(id).orElse(null);

    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Repuesto actualizarRepuesto(@PathVariable Integer id, @RequestBody Repuesto repuestoActualizado){

        return repuestoRepository.findById(id).map(repuesto -> {

            repuesto.setIdRepuesto(repuestoActualizado.getIdRepuesto());
            repuesto.setNombreRepuesto(repuestoActualizado.getNombreRepuesto());
            repuesto.setCategoriaRepuesto(repuestoActualizado.getCategoriaRepuesto());
            repuesto.setPrecioCompra(repuestoActualizado.getPrecioCompra());
            repuesto.setPrecioVenta(repuestoActualizado.getPrecioVenta());
            repuesto.setIdProveedor(repuestoActualizado.getIdProveedor());

            return repuestoRepository.save(repuesto);
        }).orElse(null);

    }

    //ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarRepuesto(@PathVariable Integer id){
        repuestoRepository.deleteById(id);
        return "Repuesto eliminado correctamente";
    }

}
