package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Repuesto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RepuestoService {

    List<Repuesto> getAllRepuesto();

    Repuesto getRepuestoByid(Integer id);

    Repuesto saveRepuesto(Repuesto repuesto);

    Repuesto updateRepuesto(Integer id, Repuesto repuesto);

    void delelteRepuesto(Integer id);
}
