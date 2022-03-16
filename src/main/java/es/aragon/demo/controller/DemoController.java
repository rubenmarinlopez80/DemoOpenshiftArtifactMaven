package es.aragon.demo.controller;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

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
	
	private static final List<Film> DUMMY_FILMS = new ArrayList<Film>();
	
	static {
		DUMMY_FILMS.add(new Film("12 years a slave", 2013, "Steve McQueen"));
		DUMMY_FILMS.add(new Film("Argo", 2012, "Ben Affleck"));
		DUMMY_FILMS.add(new Film("The Artist", 2011, "Michel Hazanavicius"));
		DUMMY_FILMS.add(new Film("The King's speech", 2010, "Tom Hooper"));
		DUMMY_FILMS.add(new Film("The Hurt Locker", 2009, "Kathryn Bigelow"));
		DUMMY_FILMS.add(new Film("Slumdog Millionaire", 2008, "Danny Boyle"));
		DUMMY_FILMS.add(new Film("No Country for Old Men", 2007, "Joel y Ethan Coen"));
	}
	
	@GetMapping(value = "/list")
	public List<Film> getFilms() {
		return DUMMY_FILMS;
	}
	
	@GetMapping(value = "/hola")
    public String hola(ModelMap model) {

    	model.addAttribute("mensaje", "holaasdafsdfsdf");
    	return "hola";

    }

}
