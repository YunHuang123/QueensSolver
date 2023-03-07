public class QueensSolver {

    public static boolean isSafe(String[][] board, int row, int col)
    {
        if (board[row][col].equals("X"))
        {
            return false;
        }
        else
        {
            board[row][col] = "Q";
            return true;
        }
    }

    public void placeQueen(String[][] board)
    {
        int row = (int)Math.random() * 9;
        int col = (int)Math.random() * 9;

        if (board[row][col].equals("X"))
        {}
        else
        {
            board[row][col] = "Q";
            for (int i = 0; i < 8; i ++)
            {
                if (!board[row][i].equals("Q"))
                {
                    board[row][i] = "X";
                }
            }
        }
    }


}
