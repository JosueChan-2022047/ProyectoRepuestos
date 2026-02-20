package com.JosueChan.Gym.controller;

import com.JosueChan.Gym.Entity.Proveedor;
import com.JosueChan.Gym.repository.ProveerdorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Proveedores")
public class ProveedorController {

    private final ProveerdorRepository proveerdorRepository;

    public ProveedorController(ProveerdorRepository proveerdorRepository) {
        this.proveerdorRepository = proveerdorRepository;
    }

    // LISTAR TODOS
    @GetMapping
    public List<Proveedor> listarTodos() {
        return proveerdorRepository.findAll();
    }

    // CREAR
    @PostMapping
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveerdorRepository.save(proveedor);
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Proveedor obtenerPorId(@PathVariable Integer id) {
        return proveerdorRepository.findById(id).orElse(null);
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Proveedor actualizarProveedor(@PathVariable Integer id, @RequestBody Proveedor proveedorActualizado) {

        return proveerdorRepository.findById(id).map(proveedor -> {

            proveedor.setNombreProveedor(proveedorActualizado.getNombreProveedor());
            proveedor.setIdProveedor(proveedorActualizado.getIdProveedor());
            proveedor.setTelefonoProveedor(proveedorActualizado.getTelefonoProveedor());
            proveedor.setTelefonoProveedor(proveedorActualizado.getTelefonoProveedor());
            proveedor.setEmailProveedor(proveedorActualizado.getEmailProveedor());

            return proveerdorRepository.save(proveedor);

        }).orElse(null);
    }

    //ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable Integer id) {
            proveerdorRepository.deleteById(id);
            return "Proveedor eliminado correctamente";
        }
    }



