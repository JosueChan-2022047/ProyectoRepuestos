package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Proveedor;
import com.JosueChan.Gym.repository.ProveerdorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceimplements implements ProveedorService {
    private final ProveerdorRepository proveerdorRepository;

    public ProveedorServiceimplements(ProveerdorRepository proveedorRepository){
        this.proveerdorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> getAllProveedor() {
        return proveerdorRepository.findAll();
    }

    @Override
    public Proveedor getProveedorById(Integer id) {
        return proveerdorRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedor saveProveedor(Proveedor proveedor) throws RuntimeException {
        return proveerdorRepository.save(proveedor);
    }

    @Override
    public Proveedor updateProveedor(Integer id, Proveedor proveedor) {
        return null;
    }

    public void deleteProveedor(Integer id) {
        proveerdorRepository.deleteById(id);

    }
}
