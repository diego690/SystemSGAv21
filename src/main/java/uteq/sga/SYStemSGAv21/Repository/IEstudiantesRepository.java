/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SYStemSGAv21.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uteq.sga.SYStemSGAv21.Models.Estudiantes;

/**
 *
 * @author capur
 */
@Repository
public interface IEstudiantesRepository extends JpaRepository<Estudiantes, Integer>{
    
}
