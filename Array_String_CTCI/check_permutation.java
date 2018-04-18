import java.util.*;

class check_permutation{

    static void check_permutation_brute_force(String str1, String str2){
        if(str1.length() != str2.length()){
            System.out.println("Permutation is not possible");
        }

        char str1_array [] = str1.toCharArray();
        char str2_array [] = str2.toCharArray();
        Arrays.sort(str1_array);
        Arrays.sort(str2_array);

        for(int i =0 ;i< str1.length();i++){
            
        }

    }

    public static void main(String args[]){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String str1 = user_input.nextLine();
        System.out.println("Enter the String 2");
        String str2 = user_input.nextLine();
        check_permutation_brute_force(str1,str2);

    }
}
