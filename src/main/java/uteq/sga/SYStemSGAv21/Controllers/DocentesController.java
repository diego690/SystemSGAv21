/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SYStemSGAv21.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uteq.sga.SYStemSGAv21.Models.Docentes;
import uteq.sga.SYStemSGAv21.Services.DocenteServices;

/**
 *
 * @author capur
 */
@Controller
public class DocentesController {
    
    @Autowired
    private DocenteServices docenteServ;
    
    @RequestMapping("/docentes")
    public String page(Model model) {
        List<Docentes> docenteList = docenteServ.getDocentes();
        model.addAttribute("listadocente", docenteList);
        model.addAttribute("titulo", "Lista de Docentes");
        return "Docentes";
    }
    
    @PostMapping("/docentes/save")
    public String Add(Docentes docentes){
        docenteServ.save(docentes);
        return "redirect:/docentes";
    }
    
    @RequestMapping("/docentes/findById")
    @ResponseBody
    public Docentes findById(Integer id){
        return docenteServ.findById(id);
    }
    
    @RequestMapping(value="/docentes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String Edit(Docentes docentes){
        docenteServ.save(docentes);
        return "redirect:/docentes";
    }
    @RequestMapping(value="/docentes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer docentes){
        docenteServ.delete(docentes);
        return "redirect:/docentes";
    }
    
}
