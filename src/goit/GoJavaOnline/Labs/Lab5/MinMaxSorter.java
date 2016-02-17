package goit.GoJavaOnline.Labs.Lab5;

public class MinMaxSorter {

    public static void FindMinMaxMethod(int[]arr){
        int min=arr[0];
        int max=arr[0];

        for(int ii=0;ii<arr.length;ii++){
            if(arr[ii]<min){
                min=arr[ii];
            }

            else if(arr[ii]>max){
                max=arr[ii];}
        }
        System.out.println("The minimum in the arr::"+min);
        System.out.println("The maximum in the arr::"+max);
    }

    public static void bubbleSort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}