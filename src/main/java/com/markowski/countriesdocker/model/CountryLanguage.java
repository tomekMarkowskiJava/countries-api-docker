package com.markowski.countriesdocker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_language")
public class CountryLanguage {
    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "language")
    private String language;

}
