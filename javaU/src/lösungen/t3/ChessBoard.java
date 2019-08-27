package lösungen.t3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChessBoard {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        System.out.println(Arrays.deepToString(chessBoard.chessBoard1()));
    }

    public int[][] chessBoard1(){
        int counter = 1;
        int [][] result = new int[8][];
        int[] x = {0,1,0,1,0,1,0,1};
        int[] y = {1,0,1,0,1,0,1,0};
        for (int i = 0; i < 8; i++){
            if (counter == 1){
                result[i] = x;
                counter++;
            }else{
                result[i] = y;
                counter = 1;
            }
        }
        return result;
    }
}
