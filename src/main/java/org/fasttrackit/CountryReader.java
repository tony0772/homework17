package org.fasttrackit;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryReader {
    public static List<Country> readCountryData(String fileName) throws FileNotFoundException {
        List<Country> result = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files",fileName));
        while(scanner.hasNext()){
            result.add(addCountryData(scanner.nextLine()));
        }
        return result;
    }

    private static Country addCountryData(String line){
        String[] splitArray = line.split("|");
        String[] splitArrayNeighbours = line.split("~");
        return Country.builder()
                .name(splitArray[0])
                .capital(splitArray[1])
                .population(Long.parseLong(splitArray[2]))
                .area(Double.parseDouble(splitArray[3]))
                .continent(splitArray[4])
                .neighbors(splitArrayNeighbours[5])
                .build();
    }
}
