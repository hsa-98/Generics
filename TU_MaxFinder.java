package com.harsh.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 1, int2 = 4, int3= 3;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(3,max,"Validating max method");
    }
}
