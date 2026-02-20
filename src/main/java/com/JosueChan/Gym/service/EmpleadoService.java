package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmpleadoService {
    List<Empleado> getAllEmpleados();

    List<Empleado> gettAllEmpleados();

    Empleado getEmpleadoById(Integer id);

    Empleado saveEmpleado(Empleado empleado) throws RuntimeException;

    Empleado updateEmpleado(Integer id, Empleado empleado);

}
