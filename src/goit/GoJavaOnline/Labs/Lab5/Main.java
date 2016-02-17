package goit.GoJavaOnline.Labs.Lab5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Main Method Started");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = in.nextInt();
        System.out.println("Enter the maximum value of the Array");
        int max = in.nextInt();
        int [] arr  = initializeArr(max, size);
        System.out.print("Original Array: "+"\n");
        print(arr);
        MinMaxSorter.FindMinMaxMethod(arr);
        MinMaxSorter.bubbleSort(arr);
        System.out.print("After sorting: "+"\n");
        print(arr);
        System.out.println("Main Method Ended");
    }

    public static void print(int[] arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int[] initializeArr(int max,int size){
        Random random = new Random();
        int [] arr = new int[size];
        for(int ii=0;ii<arr.length;ii++){
            arr[ii]=random.nextInt(max);
        }
        return arr;
    }
}