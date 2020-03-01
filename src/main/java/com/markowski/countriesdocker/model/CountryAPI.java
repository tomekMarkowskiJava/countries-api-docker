package com.markowski.countriesdocker.model;

import java.util.List;

public class CountryAPI {
    private String name;
    private String continent;
    private Integer population;
    private Float lifeExpectancy;
    private List<String> countryLanguage;

    public CountryAPI(String name, String continent, Integer population, Float lifeExpectancy, List<String> countryLanguage) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.countryLanguage = countryLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public List<String> getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(List<String> countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}
