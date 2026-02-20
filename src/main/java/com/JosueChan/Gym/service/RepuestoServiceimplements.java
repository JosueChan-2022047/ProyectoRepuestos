package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Repuesto;
import com.JosueChan.Gym.repository.RepuestoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepuestoServiceimplements implements RepuestoService {
    private final RepuestoRepository repuestoRepository;

    public RepuestoServiceimplements(RepuestoRepository repuestoRepository){
        this.repuestoRepository = repuestoRepository;
    }

    @Override
    public List<Repuesto> getAllRepuesto () { return repuestoRepository.findAll(); }

    @Override
    public Repuesto getRepuestoByid(Integer id) {
        return null;
    }

    public Repuesto getRepuestoById(Integer id){return repuestoRepository.findById(id).orElse(null);}

    @Override
    public Repuesto saveRepuesto(Repuesto repuesto) throws RuntimeException {
        return repuestoRepository.save(repuesto);
    }

    @Override
    public Repuesto updateRepuesto(Integer id, Repuesto repuesto){return null;}

    @Override
    public void delelteRepuesto(Integer id) {

    }

    public void deleteRepuesto(Integer id){
        repuestoRepository.deleteById(id);
    }

}
