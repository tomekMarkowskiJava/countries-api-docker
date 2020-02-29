package com.markowski.countriesdocker.repository;

import com.markowski.countriesdocker.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Long> {
    Country findByCode(String code);
}
