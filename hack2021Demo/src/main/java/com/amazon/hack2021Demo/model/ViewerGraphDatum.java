package com.amazon.hack2021Demo.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ViewerGraphDatum {
    private String asin;
    private int maxScore;
    private List<Integer> strengthPoints;
}
