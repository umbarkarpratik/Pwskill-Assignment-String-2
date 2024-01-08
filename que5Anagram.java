package StringAssignment06Feb;

import java.util.Arrays;

//Q5: Anagram program
public class que5Anagram {
    public static void main(String[] args){
        String s1="Keep";
        String s2="Peek";

       s1= s1.toLowerCase();
       s2= s2.toLowerCase();

        char ar1[]=s1.toCharArray();
        char ar2[]=s2.toCharArray();

        Arrays.sort(ar1);
        System.out.println(ar1);
        Arrays.sort(ar2);
        System.out.println(ar2);

        if(Arrays.equals(ar1,ar2)){
            System.out.println("Anagram");

        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
