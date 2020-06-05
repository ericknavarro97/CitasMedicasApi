/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericknavarro.CitasMedicas.controller;

import com.ericknavarro.CitasMedicas.models.Cita;
import com.ericknavarro.CitasMedicas.service.CitaService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */

@RestController
@RequestMapping("/citas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@AllArgsConstructor
public class CitaController {
    
    public CitaService service;
    
    @GetMapping
    public ResponseEntity<List<Cita>> getAllCitas(){
        return new ResponseEntity<>(service.findAllCitas(), HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cita> getCitaById(@PathVariable("id") Integer id){
        return new ResponseEntity<>(service.findCitaById(id), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Cita> createCita(@RequestBody Cita cita){
        return new ResponseEntity<>(service.createCita(cita), HttpStatus.OK);
    }
    
    @PutMapping("modificar/{id}")
    public ResponseEntity<Cita> modificarCita(@PathVariable("id") Integer id, @RequestBody Cita cita){
        return new ResponseEntity<>(service.updateCiteById(id, cita), HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable("id") Integer id){
        service.deleteCitaById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
