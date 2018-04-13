/*
Given an array arr[] of n integers. The task is to find the sum of product of each element with each element after it in the array. In other words, find sum of product of each arr[i] with each arr[j] such that j > i.

Examples:

Input : arr[] = {9, 3, 4, 2}
Output : 107
Sum of product of arr[0] with arr[1],
arr[2], arr[3] is 9*3 + 9*4 + 9*2 = 81
Sum of product of arr[1] with arr[2],
arr[3] is 3*4 + 3*2 = 18
Product of arr[2] with arr[3] is 4*2 = 8
Sum of all these sums is 81 + 18 + 8 = 107

Input : arr[] = {3, 5}
Output : 15
*/

class suffix_summing{

    static void brute_force(int arr[],int n){
        int sum=0;

        for (int i = 0; i < n;i++){
            for(int j = i+1; j < n;j++){
                sum = sum + arr[i]*arr[j];
            }
        }

        System.out.println("The sum is = "+ sum);
    }

    static void optimised_approach(int arr[],int n){
        int sum= arr[n-1];
        int res = 0;

        for( int i = n-2;i>=0;i--){
            res+=sum*arr[i];
            sum+=arr[i];
        }

        System.out.println("The sum is = "+ res);
    }

    public static void main(String args[]){
        int arr[] = { 9, 3, 4, 2 };
        int n = arr.length;

        brute_force(arr,n);
        optimised_approach(arr,n);
    }
}
