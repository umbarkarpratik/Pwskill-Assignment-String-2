package StringAssignment06Feb;

import java.util.Arrays;

//Q7: Check string contain all unique character or not.
public class que6Unique {
    public static void main(String[] args){
        String s="hefvab";
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        boolean flag=true;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]==arr[i+1]){
                flag=false;
            }
        }
     if(flag==true){
        System.out.println("All characters are unique");
     }
     else{
         System.out.println("All characters are not unique");
     }
    }
}
