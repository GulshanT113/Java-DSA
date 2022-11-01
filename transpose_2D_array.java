import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void print_1(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void swap2D(int[][] arr, int i_1, int j_1, int i_2, int j_2){
        int tamp = arr[i_1][j_1];
        arr[i_1][j_1] = arr[i_2][j_2];
        arr[i_2][j_2] = tamp;
    }
    public static int[][] transpose(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < m; j++){
                swap2D(arr, i, j, j, i);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input_1(arr, n, m);
        transpose(arr, n, m);
        print_1(arr, n, m);
    }
}