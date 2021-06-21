package com.harsh.max;

public class MaxFinder<E extends Comparable <E>> {
    E var1,var2,var3;
    public MaxFinder(E var1,E  var2, E var3){
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;

    }

    public E  findMax(){
         return( MaxFinder.findMax(var1,var2,var3));

    }
    public static <E extends Comparable <E>>  E findMax (E str1, E str2, E str3) {
       E max = str1;
       if(str1.compareTo(max)>0){
           max = str2;
       }
       if(str2.compareTo(max)>0){
           max=str3;
       }
       return max;
    }
    public  static <E> void printMax(E num1,E num2,E num3,E max){
        System.out.printf("The maximum among %s,%s and%s is %s: \n ", num1, num2, num3, max);
        return;

    }

    public static void main(String[] args) {
        Integer int1 = 2 , int2 = 3, int3 = 4;
        Float float1 = 2f , float2 = 3f , float3 = 4f;
        String str1="Yash", str2 ="Ambala",str3="Pandemic";
        Integer x =  new MaxFinder<Integer>(int1,int2,int3).findMax();
        Float maxFloat = new MaxFinder<Float>(float1,float2,float3).findMax();
        String maxStr = new MaxFinder<String>(str1,str2,str3).findMax();
        MaxFinder.printMax(int1,int2,int3,x);
        MaxFinder.printMax(float1,float2,float3, maxFloat);
        MaxFinder.printMax(str1,str2,str3,maxStr);
    }
}
