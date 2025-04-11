package br.com.meli.starwars.dto;

import br.com.meli.starwars.model.Personagem;

public class PersonagemDTO {
    private String name;
    private Double height;
    private Double mass;
    private String gender;
    private String homeworld;
    private String species;

    public PersonagemDTO() {
    }

    public PersonagemDTO(Personagem personagem) {
        this.name = personagem.getName();
        this.height = personagem.getHeight();
        this.mass = personagem.getMass();
        this.gender = personagem.getGender();
        this.homeworld = personagem.getHomeworld();
        this.species = personagem.getSpecies();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String especies) {
        this.species = especies;
    }

}
