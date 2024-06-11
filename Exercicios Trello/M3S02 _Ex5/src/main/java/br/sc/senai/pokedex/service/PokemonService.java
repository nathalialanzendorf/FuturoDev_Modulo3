package br.sc.senai.pokedex.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.sc.senai.pokedex.model.Pokemon;
import br.sc.senai.pokedex.repository.PokemonRepository;
import br.sc.senai.pokedex.utils.exceptions.NotFoundException;

@Component
public class PokemonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonService.class);

    private PokemonRepository repository;

    @Autowired
    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }
    
    public List<Pokemon> findAll() {
        LOGGER.info("Buscando todos os pokemons.");
        List<Pokemon> pokemons = repository.findAll();

        return Optional.ofNullable(pokemons)
            .orElseThrow(NotFoundException::new);
    }
    
    public List<Pokemon> findVistos() {
        LOGGER.info("Buscando todos os pokemons vistos.");
        List<Pokemon> pokemons = repository.findByCapturadoFalse();

        return Optional.ofNullable(pokemons)
            .orElseThrow(NotFoundException::new);
    }

    public List<Pokemon> findCapturados() {
        LOGGER.info("Buscando todos os pokemons capturados.");
        List<Pokemon> pokemons = repository.findByCapturadoTrue();

        return Optional.ofNullable(pokemons)
            .orElseThrow(NotFoundException::new);
    }

    public Pokemon findById(UUID id) {
        LOGGER.info("Buscando o pokemon. Id: {}.", id);
        return repository.findById(id)
            .orElseThrow(NotFoundException::new);
    }

    public void save(Pokemon pokemon) {
        LOGGER.info("Salvando o pokemon. Id: {}.", pokemon.getId());
        repository.save(pokemon);
    }

    public void delete(UUID id) {
        LOGGER.info("Excluindo o pokemon. Id: {}.", id);
        
        if (!repository.existsById(id)) {
            throw new NotFoundException();
        }

        repository.deleteById(id);
    }
}