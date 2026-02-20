package com.JosueChan.Gym.controller;

import com.JosueChan.Gym.Entity.Empleado;
import com.JosueChan.Gym.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    // LISTAR TODOS
    @GetMapping
    public List<Empleado> listarTodos() {
        return empleadoRepository.findAll();
    }

    // CREAR
    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Empleado obtenerPorId(@PathVariable Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Empleado actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado datos) {
        return empleadoRepository.findById(id)
                .map(emp -> {
                    emp.setNombre_empleado(datos.getNombre_empleado());
                    emp.setApellido_empleado(datos.getApellido_empleado());
                    emp.setPuesto_empleado(datos.getPuesto_empleado());
                    emp.setEmail_empleado(datos.getEmail_empleado());
                    emp.setIdEmpleado(datos.getIdEmpleado());
                    return empleadoRepository.save(emp);
                })
                .orElse(null);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarEmpleado(@PathVariable Integer id) {
        empleadoRepository.deleteById(id);
        return "Empleado eliminado correctamente";
    }
}
