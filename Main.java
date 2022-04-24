package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1000,5,6,32,95,85,65};
        HeapSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Scanner sc= new Scanner(System.in);
        int value= sc.nextInt();
        removeRoot(arr);
    }

    private static void HeapSort(int[] arr) {
        int n= arr.length;
        for(int i=n/2-1;i>=0;i--) {
            heapify(arr, i, n);
        }
        for(int i=n-1; i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,0,i);
        }
    }
    private static void heapify(int[] arr, int i, int n) {
        int leftch = i*2+1;
        int rightch=i*2+2;
        int largest=i;
        if(leftch<n &&  arr[leftch]>arr[largest])
            largest=leftch;
        if (rightch<n && arr[rightch]>arr[largest])
            largest=rightch;
        if (i!=largest){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,largest,n);
        }
    }
    private static void removeRoot(int []arr){
        HeapSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
            int [] arr1=Arrays.copyOfRange(arr,1, arr.length);
            System.out.print(arr1[i]+" ");
        }
    }
    }

