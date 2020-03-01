package com.markowski.countriesdocker.controller;

import com.markowski.countriesdocker.model.Country;
import com.markowski.countriesdocker.model.CountryAPI;
import com.markowski.countriesdocker.model.CountryLanguage;
import com.markowski.countriesdocker.service.CountryLanguageService;
import com.markowski.countriesdocker.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    private CountryService countryService;
    private CountryLanguageService countryLanguageService;

    public CountryController(CountryService countryService, CountryLanguageService countryLanguageService) {
        this.countryService = countryService;
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping("/{code}")
    public CountryAPI getCountryInfo(@PathVariable String code){
        Country country = countryService.getCountry(code);
        List<CountryLanguage> temp = countryLanguageService.getCountryLanguages(code);
        List<String> languages = new ArrayList<>();
        for (int i = 0; i < temp.size() ; i++) {
            String language = temp.get(i).getLanguage();
            if (!languages.contains(language))
            languages.add(language);
        }
        CountryAPI countryAPI =
                new CountryAPI(country.getName(),country.getContinent(),country.getPopulation(),country.getLifeExpectancy(), languages);
        return countryAPI;
    }
}
