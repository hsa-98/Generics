package com.harsh.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 2 , int2 = 3, int3 = 4;
        Float float1 = 2f , float2 = 3f , float3 = 4f;
        String str1="Yash", str2 ="Ambala",str3="Pandemic";
        Integer x = MaxFinder.findMax(int1,int2,int3);
        Float  y = MaxFinder.findMax(float1,float2,float3);
        String  z = MaxFinder.findMax(str1,str2,str3);
        Assertions.assertEquals(4,x,"Validating max method");
        Assertions.assertEquals(4f,y,"Validating max method");
        Assertions.assertEquals("Yash",z,"Validating max method");

    }
}
