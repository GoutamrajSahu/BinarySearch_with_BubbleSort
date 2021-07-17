package com.company;
import java.util.*;
import java.util.Arrays;
class Main {
    static boolean Search(int array[], int SearchNumber){
//        for(int i=0; i<array.length;i++){
//            System.out.println(array[i]);
//        }
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = left + ((right-left)/2);
            if(array[mid] == SearchNumber){
                return true;
            }else{
                if(SearchNumber < array[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return false;
    }

    static int[] sortArray(int array[]){

        for(int i=0; i<array.length-1;i++){
            for(int j = 0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return (array);
    }


    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = Sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter The array elements: ");
        for(int i=0 ; i<length; i++){
            array[i]=Sc.nextInt();
        }
        int[] SortedArray = sortArray(array);

//        for(int i = 0; i<array.length;i++){
//            System.out.println(SortedArray[i]);
//        }

        System.out.println("Enter The number for search: ");
        int num = Sc.nextInt();
        boolean isPresent = Search(SortedArray,num);
        if(isPresent){
            System.out.println("Given number is present in the array.");
        }else{
            System.out.println("Given number is not present in the array.");
        }
    }
}