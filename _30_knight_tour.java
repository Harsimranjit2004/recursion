package recursion;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class _30_knight_tour {
    public static void displayBoard(int[][] chess){
        for(int i =0;i<chess.length;i++){
            for(int j = 0 ;j<chess[0].length;j++){
                System.out.println(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printKnightTour(int[][] chess,String ans, int r,int c,int move){
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c] >0){
            return;
        }else if(move == chess.length*chess.length){
            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
       chess[r][c] = move;

       printKnightTour(chess, ans, r-2, c+1, move +1);
       printKnightTour(chess, ans, r-1, c+2, move +1);
       printKnightTour(chess, ans, r+1, c+2, move +1);
       printKnightTour(chess, ans, r+2, c+1, move +1);
       printKnightTour(chess, ans, r+2, c-1, move +1);
       printKnightTour(chess, ans, r+1, c+2, move +1);
       printKnightTour(chess, ans, r-1, c-2, move +1);
       printKnightTour(chess, ans, r-2, c-1, move +1);
       chess[r][c]  = 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        

        printKnightTour(arr,"",2,2, 1);
    }
}
