/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericknavarro.CitasMedicas.service.impl;

import com.ericknavarro.CitasMedicas.dao.CitaRespository;
import com.ericknavarro.CitasMedicas.models.Cita;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ericknavarro.CitasMedicas.service.CitaService;
import lombok.AllArgsConstructor;

/**
 *
 * @author Usuario
 */
@Service
@AllArgsConstructor
public class CitaServiceImpl implements CitaService{
    
    public CitaRespository repository;

    @Override
    public List<Cita> findAllCitas() {
        return repository.findAll();
    }

    @Override
    public Cita createCita(Cita cita) {
        cita.setFecha(new Date());
        return repository.save(cita);
    }

    @Override
    public Cita findCitaById(Integer id) {
        return repository.findCitaById(id);
    }

    @Override
    public Cita updateCiteById(Integer id, Cita cita) {
        
        Cita citaDB = findCitaById(id);
        
        citaDB.setNombreDoctor(cita.getNombreDoctor());
        citaDB.setNombrePaciente(cita.getNombrePaciente());
        citaDB.setFecha(new Date());
        
        createCita(cita);
        
        return citaDB;
    }

    @Override
    public void deleteCitaById(Integer id) {
        repository.deleteById(id);
    }
    
}
