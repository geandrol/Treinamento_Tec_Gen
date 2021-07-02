package rg.generation.Ajudai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rg.generation.Ajudai.model.Tema;
import rg.generation.Ajudai.repository.TemaRepository;



@RestController
@RequestMapping("/temas")
@CrossOrigin("*")
public class TemaController {

	@Autowired
	private TemaRepository repository;

	@GetMapping
	public ResponseEntity<List<Tema>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tema> GetById(@PathVariable long id){
	return repository.findById(id).map(resp -> ResponseEntity.ok(resp))

	.orElse(ResponseEntity.notFound().build());

	}
	
	@GetMapping("/tema/{tema}")
	public ResponseEntity<List<Tema>> GetByTema(@PathVariable String tema){
	return ResponseEntity.ok(repository.findAllByTemaContainingIgnoreCase(tema));
	}
	
	@PostMapping
	public ResponseEntity<Tema> Post(@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(tema));
	}
	
	@PutMapping
	public ResponseEntity<Tema> Put(@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(tema));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
	repository.deleteById(id);
	}
}