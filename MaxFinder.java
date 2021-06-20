package com.harsh.max;

public class MaxFinder {
    public static String findMax(String str1, String str2, String str3) {
       String max = str1;
       if(str2.compareTo(max)>0){
           max = str2;
       }
       if(str3.compareTo(max)>0){
           max=str3;
       }
       System.out.printf("Max value of %s %s %s is : %s \n",str1,str2,str3,max);
       return max;
    }

    public static void main(String[] args) {
        String  str1 ="Harsh";
        String str2 = "Alabama";
        String str3 = "Yash";
        String max = findMax(str1,str2,str3);
    }
}
