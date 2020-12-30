package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IGestionPfe;
import tn.essat.dao.IGestionType;

import tn.essat.model.Pfe;
import tn.essat.model.TypePfe;



@CrossOrigin("*")
@RestController
@RequestMapping(path = "/rest")
public class Rest {
	@Autowired
	IGestionPfe daopfe;
	@Autowired
	IGestionType daotype;
	
	
	@GetMapping("/pfe")
	public List<Pfe> get555(){
		return daopfe.findAll();
	}
	@GetMapping("/type")
	public List<TypePfe> get6(){
		List<TypePfe> listp =  daotype.findAll();
		for (TypePfe typePfe : listp) {
			typePfe.setListP(typePfe.getListP());
			
		}
		return listp;
	}
	@DeleteMapping("/deletepfe/{id}")
	public void get5(@PathVariable("id") int id){
		daopfe.deleteById(id);	
	}
	@GetMapping("/typepfe/{id}")
	public List<Pfe> get2(@PathVariable("id") int id){
		return daopfe.getAllPfeByTypePfe(id);		
	}
	@PostMapping("/addpfe")
	public void addM(@RequestBody Pfe m) {
		
		daopfe.save(m);
	}
	
	
}
