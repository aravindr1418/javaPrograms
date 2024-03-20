import java.util.Scanner;

public class ReversingVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word:");
        String str = in.next();
        str.toLowerCase();
     String m =   reversingVowels(str);
     str = m;
        System.out.println(str);
    }
    static String reversingVowels(String str){
        String sr ="";
        String pr ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'  || str.charAt(i)=='u' ){
                sr=sr+str.charAt(i);
            }
        }
        for (int i = 0,j=sr.length()-1; i <str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'  || str.charAt(i)=='u' ){
               pr=pr+sr.charAt(j);
               j--;
            }
            else{
               pr = pr+str.charAt(i);
            }
        }
        return pr;
    }
}
