package es.aragon.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.aragon.paea.commons.csv.CSVGenerator;

@Controller
public class DemoController {
	
	@GetMapping(value = "/index")
    public String index(Model model) {

        
        CSVGenerator csvGenerator = new CSVGenerator();

        String csvGenerado = csvGenerator.generateCSV("ccsv","1");
    	System.out.println("prueba"+csvGenerado);
    	model.addAttribute("fecha", LocalDateTime.now());
    	model.addAttribute("csv", csvGenerado);
    	return "index";

    }
	
	@GetMapping(value = "/hola")
    public String hola(ModelMap model) {

    	model.addAttribute("mensaje", "holaasdafsdfsdf");
    	return "hola";

    }

}
