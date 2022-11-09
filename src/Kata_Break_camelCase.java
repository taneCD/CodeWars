import java.util.regex.Pattern;
//https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
//Break camelCase
public class Kata_Break_camelCase {
    public static void main(String[] args) {
        String strOne = "camelCase";
        System.out.println(camelCase(strOne));
    }
    public static String camelCase(String input) {
        char ch;
        String str="";
        for(int i=0; i<input.length();i++){
            ch=input.charAt(i);
            if(Character.isUpperCase(ch)){
                str+=" ";
            }
            str+=input.charAt(i);
        }
        return str;
    }
}
