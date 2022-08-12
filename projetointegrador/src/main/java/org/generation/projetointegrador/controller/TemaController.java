package org.generation.projetointegrador.controller;

import java.util.List;

import javax.validation.Valid;

<<<<<<< HEAD
import org.generation.projetointegrador.model.TemaModel;
import org.generation.projetointegrador.repository.TemaRepository;
=======
>>>>>>> d5622626cc3a5698bc01fe1ae3983e0725807c90
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

<<<<<<< HEAD
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tema")
public class TemaController {
	
	@Autowired
	private TemaRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<TemaModel>> getAll (){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TemaModel> getById (@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/descricao/{descricao}")
	public ResponseEntity<List<TemaModel>> getByDescricao (@PathVariable String descricao) {
=======
import org.generation.projetointegrador.model.TemaModel;
import org.generation.projetointegrador.repository.TemaRepository;

@RestController
@CrossOrigin (origins = "*", allowedHeaders = "*")
@RequestMapping ("/tema")
public class TemaController {
	
	@Autowired TemaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<TemaModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<TemaModel> getById (@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/descricao/{descricao}")
	public ResponseEntity<List<TemaModel>> getByDescricao (@PathVariable String descricao){
>>>>>>> d5622626cc3a5698bc01fe1ae3983e0725807c90
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
<<<<<<< HEAD
	public ResponseEntity<TemaModel> post (@RequestBody @Valid TemaModel tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
		
	}
	
	@PutMapping
	public ResponseEntity<TemaModel> put (@RequestBody TemaModel tema) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
		
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
	

  
=======
		public ResponseEntity<TemaModel> post (@RequestBody @Valid TemaModel tema){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}
	
	@PutMapping
	public ResponseEntity<TemaModel> put (@RequestBody TemaModel tema){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
	}
	
	@DeleteMapping ("/{id}")
		public void delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
	
>>>>>>> d5622626cc3a5698bc01fe1ae3983e0725807c90
}
