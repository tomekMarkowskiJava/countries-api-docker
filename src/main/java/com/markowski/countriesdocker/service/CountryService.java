package com.markowski.countriesdocker.service;

import com.markowski.countriesdocker.model.Country;
import com.markowski.countriesdocker.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country getCountry(String code) {
        return countryRepository.findByCode(code);
    }
}
