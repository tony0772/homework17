package org.fasttrackit;

import lombok.Builder;

@Builder
public record Country(int id, String name, String capital, long population, double area, String continent,
                      String neighbors) {
    public static Integer count = 1;

    @Builder(toBuilder = true)
    public Country(int id, String name, String capital, long population, double area, String continent, String neighbors) {
        this.id = count;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbors = neighbors;

        count++;
    }
}
