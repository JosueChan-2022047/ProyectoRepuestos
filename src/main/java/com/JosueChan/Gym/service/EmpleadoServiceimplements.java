package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Empleado;
import org.springframework.stereotype.Service;
import com.JosueChan.Gym.repository.EmpleadoRepository;


import java.util.List;

@Service
public class EmpleadoServiceimplements implements EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceimplements(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> gettAllEmpleados() {
        return List.of();
    }

    @Override
    public Empleado getEmpleadoById(Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) throws RuntimeException {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Integer id, Empleado empleado) {
        return null;
    }

    public void deleteEmpleado(Integer id) {
        empleadoRepository.deleteById(id);

    }
}