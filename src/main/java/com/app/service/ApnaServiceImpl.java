package com.app.service;

import java.util.Arrays;
import java.util.List;

public class ApnaServiceImpl implements ApnaService {
    @Override
    public List<String> getAllData() {
        return Arrays.asList("Justin","Robin");
    }
}
