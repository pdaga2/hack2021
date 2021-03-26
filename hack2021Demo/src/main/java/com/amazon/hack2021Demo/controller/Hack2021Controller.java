package com.amazon.hack2021Demo.controller;

import com.amazon.hack2021Demo.model.ViewerGraphDatum;
import com.amazon.hack2021Demo.service.Hack2021Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class Hack2021Controller {

    @Autowired
    private Hack2021Service hack2021Service;

    @GetMapping(value = "/asin/{asin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ViewerGraphDatum createGraphByAsin(@PathVariable("asin") String asin) {
        return hack2021Service.createGraphByAsin(asin);
    }

    @GetMapping(value = "/health")
    public String health() {
        return "Tomcat is up and running!!!";
    }

}
