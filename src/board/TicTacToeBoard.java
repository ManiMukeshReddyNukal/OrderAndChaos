package board;


import player.Player;

public class TicTacToeBoard {

    public int boardSize;

    public UnitCell[][] ticTacBoard;

    public TicTacToeBoard(int boardSize) {
        this.setBoardSize(boardSize);
        this.setTicTacBoard(boardSize);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
    public void setTicTacBoard(int boardSize) {
        this.ticTacBoard = new UnitCell[boardSize][boardSize];

        // initialize an empty board for the game
        for (int i = 0; i < boardSize; ++i) {
            for (int j = 0; j < ticTacBoard[0].length; ++j) {
                ticTacBoard[i][j]=new UnitCell(0);
            }
        }
    }

    public UnitCell[][] getTicTacBoard() {
        return this.ticTacBoard;
    }

    public int[][] rows;
    public int[][] columns;
    public int[][] diagonals;
    public void printBoard() {

        String separator = new String();
        for (int i=0; i<boardSize;i++)
        {
            separator = separator+ "|------";
        }
        separator = separator+ "|";
        for (int i=0;i<boardSize;i++)
        {
            System.out.println(separator);
            System.out.println(printRow(i,(i)*boardSize));
        }
        System.out.println(separator);
    }

    public String printRow(int row,int cellNumber)
    {
        StringBuilder rowBuilder = new StringBuilder("|   ");
        for(int i=0;i<ticTacBoard[0].length;i++){
            cellNumber=cellNumber+1;
            if(ticTacBoard[row][i].getLevel() == 0) {
                rowBuilder.append(cellNumber);
                if (cellNumber<10) rowBuilder.append(" ");
            }
            if(ticTacBoard[row][i].getLevel() == 1) rowBuilder.append("X ");
            if(ticTacBoard[row][i].getLevel() == -1) rowBuilder.append("O ");
            rowBuilder.append("  |  ");
        }
        rowBuilder.deleteCharAt(rowBuilder.lastIndexOf("   "));
        return rowBuilder.toString();
    }
    public boolean isValidPosition(int position) {
        if (position < 1 || position > (this.boardSize * this.boardSize)) {
            System.out.println("Position is out of the board, pls recheck and enter the input");
            return false;
        }
        int row = getRowNumber(position);
        int col = getColNumber(position);

        if (ticTacBoard[row][col].getLevel()!=0)
        {
            System.out.println("Position is already filled, pls recheck and reenter the postion");
            return false;
        }
        return true;
    }

    public boolean isValidCharacter(String character) {
        if (character.equalsIgnoreCase("x")||character.equalsIgnoreCase("o")) {
            return true;
        }
        System.out.println("Entered piece : "+character+" is not a valid peace. Please reenter a piece between 'X' and 'O'");
        return false;
    }


    public void  move(int playerLevel, int position)
    {
        int row = getRowNumber(position);
        int col = getColNumber(position);
        ticTacBoard[row][col].setLevel(playerLevel);
    }

    public Boolean isMatrixFull()
    {
        for (int i=0;i<ticTacBoard.length;i++)
        {
            for (int j=0;j<ticTacBoard[0].length;j++)
            {
                if (ticTacBoard[i][j].getLevel()==0)
                {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    public Player.gameStatus winCheck()
    {
        int count;
        for (int i=0;i<ticTacBoard.length;i++)
        {  int rowSum = 0;
            for (int j=0;j<ticTacBoard[0].length;j++)
            {
                rowSum = rowSum+ticTacBoard[i][j].getLevel();
            }
            if (rowSum==boardSize)
            {
                return Player.gameStatus.PLAYER1_WINS;
            } else if (rowSum==(-1*boardSize))
            {
                return Player.gameStatus.PLAYER2_WINS;
            }
        }

        for (int i=0;i<ticTacBoard.length;i++)
        {  int colSum = 0;
            for (int j=0;j<ticTacBoard[0].length;j++)
            {
                colSum = colSum+ticTacBoard[j][i].getLevel();
            }
            if (colSum==boardSize)
            {
                return Player.gameStatus.PLAYER1_WINS;
            } else if (colSum==(-1*boardSize))
            {
                return Player.gameStatus.PLAYER2_WINS;
            }
        }
        int diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length;i++)
        {
                diagonalSum = diagonalSum+ticTacBoard[i][i].getLevel();
            if (diagonalSum==boardSize)
            {
                return Player.gameStatus.PLAYER1_WINS;
            } else if (diagonalSum==(-1*boardSize))
            {
                return Player.gameStatus.PLAYER2_WINS;
            }
        }
        diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[ticTacBoard.length-i-1][i].getLevel();
            if (diagonalSum==boardSize)
            {
                return Player.gameStatus.PLAYER1_WINS;
            } else if (diagonalSum==(-1*boardSize))
            {
                return Player.gameStatus.PLAYER2_WINS;
            }
        }
        if (isMatrixFull())
        {
            return Player.gameStatus.STALEMATE;
        }
        return Player.gameStatus.IN_PROGRESS;
    }


    public Player.gameStatus orderandchaoswinCheck()
    {
        for (int i=0;i<ticTacBoard.length;i++)
        {  int rowSum = 0;
            for (int j=0;j<ticTacBoard[0].length-1;j++)
            {
                rowSum = rowSum+ticTacBoard[i][j].getLevel();
            }
            if (rowSum==boardSize-1 || rowSum==(-1*(boardSize-1)))
            {
                return Player.gameStatus.ORDER_WINS;
            }
            rowSum = 0;
            for (int j=1;j<ticTacBoard[0].length;j++)
            {
                rowSum = rowSum+ticTacBoard[i][j].getLevel();
            }
            if (rowSum==boardSize-1 || rowSum==(-1*(boardSize-1)))
            {
                return Player.gameStatus.ORDER_WINS;
            }
        }

        for (int i=0;i<ticTacBoard.length;i++)
        {  int colSum = 0;
            for (int j=0;j<ticTacBoard[0].length-1;j++)
            {
                colSum = colSum+ticTacBoard[j][i].getLevel();
            }
            if (colSum==boardSize-1 || colSum==(-1*(boardSize-1)))
            {
                return Player.gameStatus.ORDER_WINS;
            }
            colSum = 0;
            for (int j=1;j<ticTacBoard[0].length;j++)
            {
                colSum = colSum+ticTacBoard[j][i].getLevel();
            }
            if (colSum==boardSize-1 || colSum==(-1*(boardSize-1)))
            {
                return Player.gameStatus.ORDER_WINS;
            }
        }
        int diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length-1;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[i][i].getLevel();
        }
        Player.gameStatus orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;
        diagonalSum = 0;
        for (int i=1;i<ticTacBoard.length;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[i][i].getLevel();

        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;
        diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length-1;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[i+1][i].getLevel();

        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;
        diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length-1;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[i][i+1].getLevel();
        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;

        diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length-1;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[ticTacBoard.length-1-i][i].getLevel();

        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;
        diagonalSum = 0;
        for (int i=1;i<ticTacBoard.length;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[ticTacBoard.length-1-i][i].getLevel();

        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;
        diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length-1;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[ticTacBoard.length-i-2][i].getLevel();

        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;
        diagonalSum = 0;
        for (int i=0;i<ticTacBoard.length-1;i++)
        {
            diagonalSum = diagonalSum+ticTacBoard[ticTacBoard.length-1-i][i+1].getLevel();

        }
        orderWins = checkIfOrderWon(diagonalSum);
        if (orderWins != null) return orderWins;



        if (isMatrixFull())
        {
            return Player.gameStatus.CHAOS_WINS;
        }
        return Player.gameStatus.IN_PROGRESS;
    }

    private Player.gameStatus checkIfOrderWon(int diagonalSum) {
        if (diagonalSum ==(boardSize-1) || diagonalSum ==(-1*(boardSize-1)))
        {
            return Player.gameStatus.ORDER_WINS;
        }
        return null;
    }

    public int getRowNumber(int position)
    {
        return (((position-1)/this.ticTacBoard.length));
    }

    public int getColNumber(int position)
    {
        int col = position%this.ticTacBoard.length;
        if (col==0)
        {
            return this.ticTacBoard.length-1;
        }
        return col-1;
    }

}
