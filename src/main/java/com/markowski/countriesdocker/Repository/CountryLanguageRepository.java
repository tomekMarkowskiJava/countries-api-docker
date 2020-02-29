package com.markowski.countriesdocker.Repository;

import com.markowski.countriesdocker.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryLanguageRepository extends CrudRepository<Country, Long> {
}
