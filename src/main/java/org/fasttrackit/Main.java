package org.fasttrackit;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Country> countries = CountryReader.readCountryData("countries.txt");
        System.out.println(countries);
    }
}
