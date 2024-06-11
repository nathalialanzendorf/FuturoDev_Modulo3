package br.sc.senai.pokedex.controller;

import java.util.List;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.sc.senai.pokedex.dto.PokemonV1Dto;
import br.sc.senai.pokedex.model.Pokemon;
import br.sc.senai.pokedex.service.PokemonService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/pokemon")
public class PokemonV1Controller {

    private PokemonService service;
    private ModelMapper mapper;

    @Autowired
    public PokemonV1Controller(PokemonService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    
    @GetMapping("/vistos")
    public ResponseEntity<List<Pokemon>> findVistos() {
        List<Pokemon> pokemons = service.findVistos();
        return ResponseEntity.ok().body(pokemons);
    }

    @GetMapping("/capturados")
    public ResponseEntity<List<Pokemon>> findCapturados() {
        List<Pokemon> pokemons = service.findCapturados();
        return ResponseEntity.ok().body(pokemons);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Pokemon> findById(@PathVariable UUID id) {
        Pokemon pokemon = service.findById(id);
        return ResponseEntity.ok().body(pokemon);
    }

    @PostMapping()
    public ResponseEntity<String> save(@RequestBody @Valid PokemonV1Dto dto) {
        Pokemon pokemon = mapper.map(dto, Pokemon.class);
        service.save(pokemon);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Pokemon> update(@PathVariable(value = "id") UUID id, @RequestBody @Valid PokemonV1Dto dto) {
        Pokemon pokemon = service.findById(id);
        pokemon = mapper.map(dto, Pokemon.class);
        service.save(pokemon);

        return ResponseEntity.ok().body(pokemon);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") UUID id) {
        service.delete(id);
        
        return ResponseEntity.noContent().build();
    }
}