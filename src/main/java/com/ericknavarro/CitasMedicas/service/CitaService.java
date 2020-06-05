/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericknavarro.CitasMedicas.service;

import com.ericknavarro.CitasMedicas.models.Cita;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CitaService {
    
    List<Cita> findAllCitas();
    
    Cita createCita(Cita cita);
    
    Cita findCitaById(Integer id);
    
    Cita updateCiteById(Integer id, Cita cita);
    
    void deleteCitaById(Integer id);
    
}
