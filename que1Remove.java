package StringAssignment06Feb;
//Q1: remove duplicate from string
public class que1Remove {
    public static void main (String[] args){
        String s="prra";
        char[] src = s.toCharArray();
        StringBuffer n=new StringBuffer(s);
        for(int i=0;i<src.length;i++){
            for(int j=i+1;j<src.length;j++){
                if(src[i]==src[j]){
                    System.err.println(src[i]);
                    n.deleteCharAt(i);
                }
               
            }
        }
        System.out.println(n);

    }
}
