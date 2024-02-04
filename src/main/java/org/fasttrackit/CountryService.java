package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class CountryService {
    private final List<Country> countries = new ArrayList<>();
    public CountryService(List<Country> countries){
        if(countries != null){
            this.countries.addAll(countries);
        }
    }
    public List<String> getCountries(){
        return countries.stream()
                .map(country -> country.name())
                .toList();
    }

    public List<String> getCountryCapital(){
        return countries.stream()
                .map(country -> country.capital())
                .toList();
    }
}
