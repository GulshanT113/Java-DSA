import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int target = scn.nextInt();
        int c = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i+j==target && i != j)
                    c++;    
            }
        }
        System.out.println(c);
    }
}

