import java.util.*;
import java.io.*;
import java.lang.Math;


class window_sliding{

    /*Brute force approach*/

    static void brute_force(int arr[],int n,int k){
        int max=0,tempMax=0;
        for(int i=0;i<(n-k+1);i++){

            for(int j=0;j<k;j++){
                tempMax = tempMax + arr[i+j];
            }
                max = Math.max(tempMax,max);
                tempMax=0;
        }

        System.out.println("The maximum Sum is = "+max);
    }

    static void window_sliding(int arr[],int n,int k){
        int max=0,window_sum=0;
        if(n<k){
            System.out.println("Invalid input");
        }else{
            for(int i=0; i<k; i++){
                max = max + arr[i];
            }

            window_sum = max;
            for(int i = k; i<n ; i++){
                window_sum = window_sum + arr [i] - arr[i-k];
                max= Math.max(max,window_sum);
            }

            System.out.println("The maximum sum is = "+max);
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        brute_force(arr, n, k);
        window_sliding(arr,n,k);
    }
}
