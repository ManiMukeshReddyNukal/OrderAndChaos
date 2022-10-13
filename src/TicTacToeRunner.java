import board.TicTacToeBoard;
import player.Player;
import message.Messenger;
import java.util.Scanner;

import static message.Messenger.*;


public class TicTacToeRunner {

    public Scanner scanner;

    public String playerName1;

    public String playerName2;

    public int boardSize;

    public int player1Wins;

    public int player2Wins;

    public Player player1;

    public Player player2;

    public int totalNoofWinsbyPlayer1;
    public int totalNoofWinsbyPlayer2;

    public int totalNoofPostionsOccupied;

    public TicTacToeBoard ticTacToeBoard;

    public TicTacToeRunner(){
        totalNoofWinsbyPlayer1=0;
        totalNoofWinsbyPlayer2=0;
        totalNoofPostionsOccupied=0;
        scanner = new Scanner(System.in);
        initializeGame();
        initializePlayersAndBoard();
    }

    public void start()
    {   int playerId=1;

        while (true)
        {
            playerId=playersMovinginTurns(playerId);
            Player.gameStatus gameStatus = getGameStatus();
            if (gameStatus.equals(Player.gameStatus.PLAYER1_WINS))
            {
                getWinnerMessage(playerName1);
                totalNoofWinsbyPlayer1++;
            }else if (gameStatus.equals(Player.gameStatus.PLAYER2_WINS))
            {
                getWinnerMessage(playerName2);
                totalNoofWinsbyPlayer2++;
            }else if (gameStatus.equals(Player.gameStatus.STALEMATE))
            {
                System.out.println("Stalement reached");
            } else if (gameStatus.equals(Player.gameStatus.ORDER_WINS))
            {
                getCustomWinMessage(playerName1,"ORDER");
                totalNoofWinsbyPlayer1++;
            }else if (gameStatus.equals(Player.gameStatus.CHAOS_WINS))
            {
                getCustomWinMessage(playerName2,"CHAOS");
                totalNoofWinsbyPlayer2++;
            }
            else {
                continue;
            }

            this.ticTacToeBoard.printBoard();
            this.continuePlayOrExit();

        }

    }

    public Player.gameStatus getGameStatus() {
        Player.gameStatus gameStatus = this.ticTacToeBoard.winCheck();
        return gameStatus;
    }

    public int playersMovinginTurns(int playerId)
    {
        if (playerId==1)
        {
            this.player1.processPlayerMove(this.ticTacToeBoard,1);
            playerId=2;   // players moving in turns
        } else if (playerId==2)
        {
            this.player2.processPlayerMove(this.ticTacToeBoard,-1);
            playerId=1;
        }
        totalNoofPostionsOccupied++;
        return playerId;
    }



    private void initializeGame() {
        welcomeGame();
        final String playerDecisionToPlay = scanner.nextLine();
        if (!playerDecisionToPlay.equalsIgnoreCase("Y"))
        {
            Messenger.exitMessage("User Decided to Quit without starting the game");
            System.exit(0);
        }
        totalNoofWinsbyPlayer1=0;
        totalNoofWinsbyPlayer2=0;
        totalNoofPostionsOccupied=0;
    }

    public void welcomeGame() {
        Messenger.welcomeMessage();
    }

    private void initializePlayersAndBoard()
    {
        Messenger.getPlayerNameMessage(1);
        playerName1=scanner.nextLine();
        Messenger.getPlayerNameMessage(2);
        playerName2=scanner.nextLine();
        setBoardSize();
        this.player1=new Player(playerName1);
        this.player2=new Player(playerName2);
        this.ticTacToeBoard=new TicTacToeBoard(boardSize);
    }

    public void setBoardSize() {
        while (true) {
            getBoardSizeMessage(1);
            if (scanner.hasNextInt())
            {
                boardSize=scanner.nextInt();

                if (boardSize<3 || boardSize >15)
                {
                    getBoardSizeMessage(2);
                    continue;
                }
                else {
                    break;
                }
            }
            else {
                scanner.next();
                getBoardSizeMessage(3);
            }
        }
    }

    private void continuePlayOrExit()
    {
        newGame();
        scanner = new Scanner(System.in);
        String userDecision = scanner.nextLine();
        if (userDecision.equalsIgnoreCase("y"))
        {
            newRound();
            totalNoofPostionsOccupied=0;
            this.ticTacToeBoard=new TicTacToeBoard(boardSize);

        }
        else {
            printGameSessionSummary(totalNoofWinsbyPlayer1,playerName1,totalNoofWinsbyPlayer2,playerName2);
            exitMessage(" Game ended");
            scanner.close();
            this.player1.getSc().close();
            this.player2.getSc().close();
            System.exit(0);
        }

    }
}
