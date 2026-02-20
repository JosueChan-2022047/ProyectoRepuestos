package com.JosueChan.Gym.service;

import com.JosueChan.Gym.Entity.Proveedor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProveedorService {

    List<Proveedor> getAllProveedor();

    Proveedor getProveedorById(Integer id);

    Proveedor saveProveedor(Proveedor proveedor);

    Proveedor updateProveedor(Integer id, Proveedor proveedor);

    void deleteProveedor(Integer id);
}