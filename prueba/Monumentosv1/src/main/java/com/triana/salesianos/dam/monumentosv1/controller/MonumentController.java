package com.triana.salesianos.dam.monumentosv1.controller;

import com.triana.salesianos.dam.monumentosv1.models.Monument;
import com.triana.salesianos.dam.monumentosv1.repository.MonumentRepository;
import com.triana.salesianos.dam.monumentosv1.service.MonumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/monumentos")
public class MonumentController {

    @Autowired
    private MonumentService monumentService;

    @GetMapping ("/crearMonumento")
    public String showForm(Model model) {

        Monument m = new Monument();
        model.addAttribute("monumentList", m);

        return "";

    }

    @PostMapping("addMonument")
    public String submit(@ModelAttribute("") Monument m) {
        monumentService.save(m);
        return "";
    }

    @GetMapping("/eliminarMonument")
    public String eliminarMonument(@RequestParam long id) {
        monumentService.deleteById(id);
        return "";
    }

    @GetMapping("/editar/{id}")
    public String showFormEdit(@PathVariable("id") long id, Model model) {
        Optional<Monument> aEditarOptional = monumentService.findById(id);
        if (aEditarOptional.isPresent()) {
            Monument aEditar = aEditarOptional.get();
            List<Monument> monumentList = monumentService.findAll();
            model.addAttribute("monument", aEditar);
            model.addAttribute("monumentList", monumentList);
            return "";
        } else {
            return "";
        }
    }

    @PostMapping("/editar/submit")
    public String procesarFormularioEdit(@ModelAttribute("monument") Monument m) {
        monumentService.edit(m);
        return "";
    }


}
