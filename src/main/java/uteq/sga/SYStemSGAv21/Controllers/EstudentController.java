/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SYStemSGAv21.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uteq.sga.SYStemSGAv21.Models.Estudiantes;
import uteq.sga.SYStemSGAv21.Services.EstudiantesServices;

/**
 *
 * @author capur
 */
@Controller
public class EstudentController {
    @Autowired
    private EstudiantesServices estuserv;
    
    @RequestMapping("/students")
    public String page(Model model) {
        List<Estudiantes> docenteList = estuserv.getDocentes();
        model.addAttribute("listadoEstudiantes", docenteList);
        model.addAttribute("titulo", "Lista de Estudiantes");
        return "Estudiantes";
    }
     @PostMapping("/students/save")
    public String Add(Estudiantes docentes){
        estuserv.save(docentes);
        return "redirect:/docentes";
    }
    
     @RequestMapping("/students/findById")
    @ResponseBody
    public Estudiantes findById(Integer id){
        return estuserv.findById(id);
    }
    
    @RequestMapping(value="/students/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String Edit(Estudiantes docentes){
        estuserv.save(docentes);
        return "redirect:/students";
    }
    @RequestMapping(value="/students/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer docentes){
        estuserv.delete(docentes);
        return "redirect:/students";
    }
    
}
