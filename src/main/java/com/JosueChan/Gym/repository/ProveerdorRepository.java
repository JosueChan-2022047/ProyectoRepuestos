package com.JosueChan.Gym.repository;

import com.JosueChan.Gym.Entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveerdorRepository  extends JpaRepository<Proveedor,Integer>{
}
