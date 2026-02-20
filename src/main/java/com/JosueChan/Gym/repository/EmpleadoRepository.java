package com.JosueChan.Gym.repository;

import com.JosueChan.Gym.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository  extends JpaRepository<Empleado,Integer> {

}
