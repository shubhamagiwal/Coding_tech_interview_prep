import java.util.*;

class max_element{

    static void bruteForce(int arr[],int k){

        ArrayList<Integer> max_array=new ArrayList<Integer>();

        for(int i=0;i<(arr.length - k)+1;i++){
            int  max_value = Integer.MIN_VALUE;
            for(int j=i;j<(i+k);j++){
                max_value = Math.max(max_value,arr[j]);
            }
            max_array.add(max_value);
        }

        System.out.println(max_array);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,1,4,5,2,3,6};
        Scanner user_input=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = user_input.nextInt();
        bruteForce(arr,k);
    }
}
