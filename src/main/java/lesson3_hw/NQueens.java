package lesson3_hw;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        if (n <= 0) return list;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)

            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        solveNQueens(list, board, 0);
        return list;

    }

    private void solveNQueens(List<List<String>> list, char[][] board, int col) {
        int n = board.length;
        if (col == n) {
            List<String> strList = new ArrayList<>();
            for (int i = 0; i < n; i++)
                strList.add(new String(board[i]));
            list.add(strList);
        } else {

            for (int i = 0; i < n; i++) {
                if (isSafe(board, i, col)) {
                    board[i][col] = 'Q';
                    solveNQueens(list, board, col + 1);
                    board[i][col] = '.';
                }

            }
        }
    }


    private boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;
        for (int j = 0; j < col; j++)
            if (board[row][j] == 'Q') return false;

        for (int i = 0; i < n; i++)
            if (i != row && board[i][col] == 'Q') return false;
        int s = row + col;

        for (int i = 0; i < n; i++) {
            int j = s - i;
            if (j >= 0 && j < n && j != col && board[i][j] == 'Q') return false;
        }

        s = row - col;
        for (int i = 0; i < n; i++) {
            int j = i - s;
            if (j >= 0 && j < n && j != col && board[i][j] == 'Q') return false;
        }
        return true;
    }

}

