package player;

import board.TicTacToeBoard;

import java.util.Scanner;

public class Player {

    private String userName;

    public enum gameStatus {
        PLAYER1_WINS, PLAYER2_WINS, IN_PROGRESS, STALEMATE, ORDER_WINS, CHAOS_WINS
    }

    private Scanner sc;

    public Player(String userName) {
        this.userName = userName;
        this.sc = new Scanner(System.in);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void processPlayerMove(TicTacToeBoard ticTacToeBoard, int playerLevel)
    {
        int movePosition;
        while (true) {
            System.out.println("The current board configuration is the below ");
            ticTacToeBoard.printBoard();
            System.out.println("Player " + this.getUserName() + " pls enter your move position between 1 to " + ticTacToeBoard.boardSize * ticTacToeBoard.boardSize);

            if (sc.hasNextInt())
            {
                movePosition= sc.nextInt();
                if (!ticTacToeBoard.isValidPosition(movePosition))
                {
                    continue;
                }else {
                    break;
                }
            }
            else {
                System.out.println(this.getUserName()+ " Position needs to be an integer, Please enter a integer");
            }
        }

        ticTacToeBoard.move(playerLevel,movePosition);
    }


    public void processOCPlayerMove(TicTacToeBoard ticTacToeBoard)
    {
        int playerLevel=0;
        int movePosition;
        String moveChar;
        while (true) {
            System.out.println("The current board configuration is the below ");
            ticTacToeBoard.printBoard();
            System.out.println("Player " + this.getUserName() + " pls enter your move position between 1 to " + ticTacToeBoard.boardSize * ticTacToeBoard.boardSize );

            if (sc.hasNextInt())
            {
                movePosition= sc.nextInt();
                if (!ticTacToeBoard.isValidPosition(movePosition))
                {
                    continue;
                }else {
                    break;
                }
            }
            else {
                System.out.println(this.getUserName()+ " Position needs to be an integer, Please enter a integer");
            }
        }

        while (true) {
            System.out.println("Player " + this.getUserName() + " pls enter your move piece between 'X' and 'O'" );
            if (sc.hasNext())
            {
                moveChar = sc.next();
                if (!ticTacToeBoard.isValidCharacter(moveChar))
                {
                    continue;
                }else {
                    if (moveChar.equalsIgnoreCase("x"))
                    {
                        playerLevel=1;
                    }
                    else if (moveChar.equalsIgnoreCase("o"))
                    {
                        playerLevel=-1;
                    }
                    break;
                }

            }
        }
        ticTacToeBoard.move(playerLevel,movePosition);
    }



}
