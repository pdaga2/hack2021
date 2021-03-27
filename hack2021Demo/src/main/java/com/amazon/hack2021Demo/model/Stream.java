package com.amazon.hack2021Demo.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Data
public class Stream {
    //TODO Define all the columns
    @CsvBindByName(column = "playhead")
    private Long playhead;

    // @CsvBindByName(column = "column2")
    // private Long column2;
}