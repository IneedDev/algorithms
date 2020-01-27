package plays;

public class Main {

    public static void main(String[] args) {

        int row = 3;
        int column = 3;
        String [] [] board = new String[row][column];

        board[1][2] = "x";
        String mark = " -";
        createBoard(row, column, board, mark);

        String sepSign = "|";

        board [1][2] = " x " + sepSign;

        board[1][1] = " o " + sepSign;



        for (int i = 0; i < row; i++) {
            System.out.print(sepSign);
            for (int j = 0; j < column; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("\n");
        }


    }

    public static void createBoard(int row, int column, String[][] board, String mark) {
        for (int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < column; j++) {
                System.out.print(board[i][j] = mark+ " |");
            }
            System.out.println("\n");
        }
        System.out.println(board);
    }


}
