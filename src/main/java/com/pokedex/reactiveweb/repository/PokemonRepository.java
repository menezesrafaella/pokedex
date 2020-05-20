package com.pokedex.reactiveweb.repository;

import com.pokedex.reactiveweb.model.pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository<pokemon, String> {
}
