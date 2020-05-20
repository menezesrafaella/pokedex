package com.pokedex.reactiveweb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class pokemon {
    @Id
    private String id;
    private String nome;
    private String categoria;
    private String habilidades;
    private Double peso;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pokemon pokemon = (pokemon) o;
        return Objects.equals(id, pokemon.id) &&
                Objects.equals(nome, pokemon.nome) &&
                Objects.equals(categoria, pokemon.categoria) &&
                Objects.equals(habilidades, pokemon.habilidades) &&
                Objects.equals(peso, pokemon.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, categoria, habilidades, peso);
    }

    @Override
    public String toString() {
        return "pokemon{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", peso=" + peso +
                '}';
    }

    public pokemon() {
        super();
    }

    public pokemon(String id, String nome, String categoria, String habilidades, Double peso) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.habilidades = habilidades;
        this.peso = peso;
    }
}