package StringAssignment06Feb;
//Q2: Print Duplicate From String
public class que2PrintDupli {
    public static void main(String[] args){
        String s="praa";
        char str[]=s.toCharArray();
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i]==str[j]){
                    System.out.println(str[i]);
                }
            }
        }
    }
}
