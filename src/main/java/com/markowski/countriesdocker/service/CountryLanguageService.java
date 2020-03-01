package com.markowski.countriesdocker.service;

import com.markowski.countriesdocker.model.CountryLanguage;
import com.markowski.countriesdocker.repository.CountryLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {
    private CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }


    public List<CountryLanguage> getCountryLanguages(String countryCode){
        return countryLanguageRepository.findByCountryCode(countryCode);
    }
}
