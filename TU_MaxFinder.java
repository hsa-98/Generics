package com.harsh.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer[] num = {5,10,9} ;
        Float[] float1 = {6f,79f,88f};
        String [] str = {"Yash","Zebra","Ambala"};

        Integer x = new MaxFinder<Integer>(num).findMax();
        Float maxFloat = new MaxFinder<Float>(float1).findMax();
        String maxStr = new MaxFinder<String>(str).findMax();
        Assertions.assertEquals(10,x,"Validating max method");
        Assertions.assertEquals(88f,maxFloat,"Validating max method");
        Assertions.assertEquals("Zebra",maxStr,"Validating max method");


    }
}
