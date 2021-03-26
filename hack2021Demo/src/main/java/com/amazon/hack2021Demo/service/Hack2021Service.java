package com.amazon.hack2021Demo.service;

import java.util.List;

import com.amazon.hack2021Demo.dao.Hack2021Dao;
import com.amazon.hack2021Demo.model.Stream;
import com.amazon.hack2021Demo.model.ViewerGraphDatum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Hack2021Service {

    @Autowired
    private Hack2021Dao hack2021Dao;
    
    public ViewerGraphDatum createGraphByVcid(String asin) {
        //TODO write logic to create bucket
        try {
            List<Stream> streamList =  hack2021Dao.getStreamDataByVcid(asin);
            log.info(streamList.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
