package edu.ilp.JaQuispe.controller;

import edu.ilp.JaQuispe.entity.Estidiante;
import edu.ilp.JaQuispe.entity.Persona;
import edu.ilp.JaQuispe.service.IEstudianteSevice;
import edu.ilp.JaQuispe.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class JapController {
   @Autowired
    private IPersonaService personaService;
   @GetMapping("/lisatarpersona")
    public List<Persona> listarPer(){
       return this.personaService.listarPersona();
   }
   @Autowired
    private IEstudianteSevice estudianteSevice;
   @GetMapping("/buscar")
    public Estidiante buscarPorCodigo(@RequestParam String codigo){
       return this.estudianteSevice.buscaPorCodigp(codigo);
   }

}
