package com.harsh.max;

import com.sun.source.tree.SwitchExpressionTree;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class MaxFinder<E extends Comparable <E>> {
    E[] array;

    public MaxFinder(E[] array){
        this.array = array;

    }

    public E  findMax(){
        return(findMax(array)) ;
    }
    public static <E extends Comparable <E>> E findMax (E[] array) {
        Arrays.sort(array);
        E max = array[array.length-1];
        printMax(array,max);
        return max;
    }

    public  static <E> void printMax(E[] array, E max){
        System.out.print("The maximum among ");
        for(int i = 0;i < array.length;i++ ) {
            System.out.print(array[i]+" ");
        }
        System.out.println("is: " +max);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                Integer[] num = {5,10,9} ;
                Float[] float1 = {6f,79f,88f};
                String [] str = {"Yash","Zebra","Ambala"};

                Integer x = new MaxFinder<Integer>(num).findMax();
                Float maxFloat = new MaxFinder<Float>(float1).findMax();
                String maxStr = new MaxFinder<String>(str).findMax();
        }
    }

