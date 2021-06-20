package com.harsh.max;

public class MaxFinder {
    public static Float findMax(Float num1, Float num2, Float num3) {
       Float max = num1;
       if(num2.compareTo(max)>0){
           max = num2;
       }
       if(num3.compareTo(max)>0){
           max=num3;
       }
       System.out.printf("Max value of %s %s %s is : %s \n",num1,num2,num3,max);
       return max;
    }

    public static void main(String[] args) {
        Float  num1 = 0f;
        Float num2 = 1f;
        Float num3 = 2f;
        Float max = findMax(num1,num2,num3);
    }
}
