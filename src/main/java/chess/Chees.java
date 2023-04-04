package chess;

import java.util.Arrays;
import java.util.List;

public class Chees {
    public static void main(String[] args) {
        Queen queen2 = new Queen(6,0);
        Queen queen3 = new Queen(5,1);
        Queen queen4 = new Queen(4,2);
        Queen queen5 = new Queen(3,3);
        Queen queen6 = new Queen(2,4);
        Queen queen7 = new Queen(1,5);
        Queen queen8 = new Queen(0,6);
        Queen queen1 = new Queen(7,7);

        List<Queen> queens = Arrays.asList(queen2, queen3, queen4, queen5, queen6, queen1, queen7, queen8);
        Board board = new Board(queens);
        board.validateColissions();
    }
}
