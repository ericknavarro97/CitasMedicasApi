/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericknavarro.CitasMedicas.dao;

import com.ericknavarro.CitasMedicas.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */

@Repository
public interface CitaRespository extends JpaRepository<Cita, Integer> {
    
    Cita findCitaById(Integer id);
    
}
