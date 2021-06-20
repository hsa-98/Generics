package com.harsh.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        String num1 = "Harsh";
        String num2 = "Alabama";
        String num3= "Yash";
        String max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals("Yash",max,"Validating max method");
    }
}
