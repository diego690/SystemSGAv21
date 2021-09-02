/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SYStemSGAv21.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uteq.sga.SYStemSGAv21.Models.Docentes;
import uteq.sga.SYStemSGAv21.Repository.IDocenteRepository;

/**
 *
 * @author capur
 */
@Service
public class DocenteServices {
    @Autowired
    private IDocenteRepository docenteRepo;
    //retorna lista de docentes
    public List<Docentes> getDocentes(){
        return docenteRepo.findAll();
    }
    
    //save
    public void save(Docentes docente){
        docenteRepo.save(docente);
    }
    
    //get id
    public Docentes findById(Integer id){
        return docenteRepo.findById(id).orElse(null);
    }
    
    //delete
    public void delete(Integer docente){
        docenteRepo.deleteById(docente);
    }
    
}
