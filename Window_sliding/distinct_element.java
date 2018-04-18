import java.util.*;

class distinct_element{

    static void bruteForce(int arr[],int k){

        ArrayList<Integer> output_array = new ArrayList<Integer>();

        for(int i = 0; i<(arr.length-k)+1 ; i++){
            int count = 0;
            HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
            for(int j = i; j < (i+k); j++ ){
                if(hmap.containsKey(arr[j])){
                    hmap.put(arr[j],hmap.get(arr[j])+1);
                }else{
                    hmap.put(arr[j],1);
                    count++;
                }
            }
            output_array.add(count);
        }

        System.out.println(output_array);
    }

    static void efficient_solution(int arr[] , int k){

        ArrayList<Integer> output_array = new ArrayList<Integer>();
        HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
        int i=0,count=0;
        for(i=0;i<k;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }else{
                hmap.put(arr[i],1);
                count++;
            }
        }

        output_array.add(count);

        for(int j = k; j < (arr.length); j++){

            System.out.println(hmap);

            if(hmap.containsKey(arr[j-k])){
                int value = hmap.get(arr[j-k]);
                if(value>1){
                    hmap.put(arr[j-k],hmap.get(arr[j-k])-1);
                }else{
                    hmap.remove(arr[j-k]);
                    count--;
                }
            }

            System.out.println(hmap);

            if(hmap.containsKey(arr[j])){
                hmap.put(arr[j],hmap.get(arr[j])+1);
            }else{
                hmap.put(arr[j],1);
                count++;
            }

            output_array.add(count);
        }

        System.out.println(output_array);
    }

    public static void main(String args[]){
        int arr[]={1,2,1,3,4,2,3};
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = user_input.nextInt();
        //bruteForce(arr,k);
        efficient_solution(arr,k);
    }
}
