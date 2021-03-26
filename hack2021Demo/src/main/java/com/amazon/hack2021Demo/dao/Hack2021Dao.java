package com.amazon.hack2021Demo.dao;

import java.io.FileReader;
import java.util.List;

import com.amazon.hack2021Demo.model.Stream;
import com.opencsv.bean.CsvToBeanBuilder;

import org.springframework.stereotype.Repository;


@Repository
public class Hack2021Dao {

    private static final String FILE_PATH_1 = "/Users/dagapune/Downloads/hack2021Demo/src/main/resources/static/test.csv";
    
    public List<Stream> getStreamDataByAsin(String asin) throws Exception {
        //TODO write logic to map csv data with vcid id
        return new CsvToBeanBuilder(new FileReader(FILE_PATH_1))
        .withType(Stream.class).build().parse(); 
    }

}
