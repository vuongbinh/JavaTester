package com.company;

import FuntionSupported.Array;
import FuntionSupported.NumberValidation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Array array = new Array();
        //NumberValidation number = new NumberValidation();
        Integer[] arr = new Integer[]{10,3,4,1,3,9,0};
        array.ascendingSort(arr);
        System.out.println();
        array.decendingSort(arr);


    }
}
