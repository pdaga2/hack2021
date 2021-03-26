package com.amazon.hack2021Demo.model;

import java.util.List;

import lombok.Data;

@Data
public class ViewerGraphDatum {
    private String vcid;
    private int maxScore;
    private List<Integer> strengthList;
}
