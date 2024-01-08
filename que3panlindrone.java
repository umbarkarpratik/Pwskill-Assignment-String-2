package StringAssignment06Feb;
//Q3: check "2552" is palindrone or not.
public class que3panlindrone {
    public static void main(String[] args){
        String s="2552";
        char[] str=s.toCharArray();
        String pan;
        int n=0;
        for(int i=0;i<str.length;i++){
            if(str[i]!=str[str.length-(i+1)]){
                n=1;
            }
        }
        if(n==1){
            System.out.println("not panlindrone");
        }
        else{
             System.out.println(" panlindrone");
        }
    }
}
