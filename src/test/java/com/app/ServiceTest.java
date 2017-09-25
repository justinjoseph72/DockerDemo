package com.app;


import com.app.service.ApnaService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServiceTest {
    @Autowired
    @Qualifier(value = "apna")
    ApnaService apnaService;
    @Autowired
    @Qualifier(value = "humara")
    ApnaService humaraService;

    @Test
    public void testApna(){

        List<String> myList = apnaService.getAllData();
        Assert.assertEquals("Justin",myList.get(0));
        Assert.assertEquals("Robin",myList.get(1));
    }

    @Test
    public void testHumara(){
        List<String> myList = humaraService.getAllData();
        Assert.assertEquals("Justin",myList.get(1));
        Assert.assertEquals("Saumya",myList.get(0));
    }
}
