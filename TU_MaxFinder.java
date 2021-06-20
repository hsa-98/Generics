package com.harsh.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Float num1 = 1f;
        Float num2 = 4f;
        Float num3= 3f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(4,max,"Validating max method");
    }
}
