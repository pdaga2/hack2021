package com.amazon.hack2021Demo.dao;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.hack2021Demo.model.Stream;
import com.opencsv.bean.CsvToBeanBuilder;

import org.springframework.stereotype.Repository;


@Repository
public class Hack2021Dao {

    private static final String BASE_PATH = System.getProperty("user.dir");
    private static final String FILE_PATH_ASIN_TEST = BASE_PATH + "/hack2021Demo/src/main/resources/static/test.csv";
    private static final String FILE_PATH_ASIN_1 = BASE_PATH + "/hack2021Demo/src/main/resources/static/asin_1.csv";
    private static final String FILE_PATH_ASIN_2 = BASE_PATH + "/hack2021Demo/src/main/resources/static/asin_2.csv";

    private static final Map<String, String> ASIN_FILE_MAP = new HashMap<>();

    static{
        ASIN_FILE_MAP.put("asin_test", FILE_PATH_ASIN_TEST);
        ASIN_FILE_MAP.put("asin1", FILE_PATH_ASIN_1);
        ASIN_FILE_MAP.put("asin2", FILE_PATH_ASIN_2);
    }
    
    public List<Stream> getStreamDataByAsin(String asin) throws Exception {
        //TODO write logic to map csv data with vcid id
        return new CsvToBeanBuilder(new FileReader(ASIN_FILE_MAP.get(asin))).withType(Stream.class).build().parse(); 
    }

}
