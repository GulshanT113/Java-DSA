import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_hard(int n){
        int nsp = n-1;
        int nst = 1;
        for(int r = 1; r<2*n; r++){
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print("  ");
            }
            for(int cst = 1; cst<= nst; cst++){
                System.out.print(r + " ");
            }
            if(r<n){
                nst += 2;
                nsp --;
            }
            else{
                nst =- 2;
                nsp ++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        pattern_hard(n);
    }
}
