import java.util.*;

class isUnique{

    // Only to work if the case is the same . Upper or lower
    static void bruteForce(String word){
        char[] str_array = word.toCharArray();
        Arrays.sort(str_array);
        boolean flag=false;
        for(int i=1;i<word.length();i++){
            if(str_array[i-1] == str_array[i]){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Duplicates present");
        }else{
             System.out.println("Duplicates not present");
        }

    }

    static void optimalSolution(String word){
     // ASCII characters - 24
        int u =0;
        boolean flag=false;
        for(int i=0; i< word.length();i++){
            char ch = word.charAt(i);
            int pos = ch - 'a';
            if((u & 1<<pos) == 1){
                flag = true;
                break;
            }else{
                u |= (1<<pos);
            }
        }

        if(flag){
            System.out.println("Duplicates present");
        }else{
             System.out.println("Duplicates not present");
        }

    }

    /* Another Approach */
    public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}

    public static void main(String args[]){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter to String");
        String str= user_input.nextLine();
        bruteForce(str);
        optimalSolution(str);
    }
}
