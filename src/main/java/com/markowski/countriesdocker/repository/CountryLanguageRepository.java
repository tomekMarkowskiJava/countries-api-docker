package com.markowski.countriesdocker.repository;

import com.markowski.countriesdocker.model.CountryLanguage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, Long> {

    List<CountryLanguage> findByCountryCode(String countryCode);
}
