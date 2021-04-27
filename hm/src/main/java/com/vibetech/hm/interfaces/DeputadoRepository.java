package com.vibetech.hm.interfaces;
import java.util.List;

import com.vibetech.hm.model.Deputado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeputadoRepository extends JpaRepository<Deputado, Long>{
    List<Deputado> findAll();     
}
