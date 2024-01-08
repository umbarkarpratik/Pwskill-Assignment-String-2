package StringAssignment06Feb;
//Q4: count vowels,special charcter,consonants in string
public class que4Count {
    public static void countcharacters (String input){
        int vowelcount=0;
        int specialcharcount=0;
        int consonantscount=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelcount++;
            }
            else if((ch>='a' && ch<='z') && !isVowel(ch)){
                consonantscount++;
            }
            else if(!Character.isWhitespace(ch) && !Character.isLetter(ch) && 
                     !Character.isDigit(ch)){

                specialcharcount++;
            }
        }
        System.out.println(vowelcount);
        System.out.println(consonantscount);
        System.out.println(specialcharcount);

    }
    private static boolean isVowel(char ch) {
        return false;
    }
    public static void main (String[] args){
        String s= "Hello world!123";
        countcharacters(s);
    }
}
