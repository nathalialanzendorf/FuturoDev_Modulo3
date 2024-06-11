package br.sc.senai.pokedex.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.sc.senai.pokedex.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, UUID> {
    
    List<Pokemon> findByCapturadoFalse();
    List<Pokemon> findByCapturadoTrue();
}