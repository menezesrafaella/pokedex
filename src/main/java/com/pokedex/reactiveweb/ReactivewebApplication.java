package com.pokedex.reactiveweb;

import com.pokedex.reactiveweb.model.pokemon;
import com.pokedex.reactiveweb.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactivewebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactivewebApplication.class, args);}

			@Bean
			CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository){
				return args -> {
					Flux<pokemon> pokemonFlux = Flux.just(
							new pokemon(null, "Bulbassauro", "Semente", "OverGrow", 6.09),
							new pokemon(null, "Charizard", "Fogo", "Blaze", 90.05),
							new pokemon(null, "Caterpie", "Minhoca", "Poeira do Escudo", 2.09),
							new pokemon(null, "Blastoise", "Marisco", "Torrente", 6.09))
							.flatMap(repository::save);

					pokemonFlux
							.thenMany(repository.findAll())
							.subscribe(System.out::println);
				};
			}
		}

