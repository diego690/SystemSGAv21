/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SYStemSGAv21.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uteq.sga.SYStemSGAv21.Models.Estudiantes;
import uteq.sga.SYStemSGAv21.Repository.IEstudiantesRepository;

/**
 *
 * @author capur
 */
@Service
public class EstudiantesServices {
    
    @Autowired
    private IEstudiantesRepository esturepo;
    
    
    public List<Estudiantes> getDocentes(){
        return esturepo.findAll();
    }
    
    //save
    public void save(Estudiantes docente){
        esturepo.save(docente);
    }
    
    //get id
    public Estudiantes findById(Integer id){
        return esturepo.findById(id).orElse(null);
    }
    
    //delete
    public void delete(Integer docente){
        esturepo.deleteById(docente);
    }
    
}
