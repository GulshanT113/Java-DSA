import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String count_lower_case(){
        String a = scn.nextLine();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                b += (char)(a.charAt(i)-'A'+'a');
            }
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(count_lower_case());
    }
}