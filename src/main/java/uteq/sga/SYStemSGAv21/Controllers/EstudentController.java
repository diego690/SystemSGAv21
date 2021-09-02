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
import org.springframework.web.bind.annotation.RequestMapping;
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
        List<Estudiantes> docenteList = estuserv.listarTodos();
        model.addAttribute("listadoEstudiantes", docenteList);
        model.addAttribute("titulo", "Lista de Estudiantes");
        return "Estudiantes";
    }
    
}
