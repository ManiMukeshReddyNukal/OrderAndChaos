package message;

/*
* Service to deliver messages to the user/terminal
* */


public class Messenger {


    public static void chooseGame()
    {
        System.out.println(" Welcome to Mani's Game");
        System.out.println("Please enter t/T to play TIC TAC TOE or o/O to play ORDER AND CHAOS");
    }
    public static void welcomeMessage()
    {
        System.out.println(" Welcome to TIC TAC TOE");
        System.out.println("Please enter y/Y if you would like to play a game");
    }

    public static void welcomeOACMessage()
    {
        System.out.println(" Welcome to ORDER AND CHAOS");
        System.out.println("Please enter y/Y if you would like to play a game");
    }

    public static void exitMessage(String reason )
    {
        System.out.println(" Terminating : "+reason);

    }

    public static void getPlayerNameMessage(int playerNo)
    {
        System.out.println("Please enter the name of the Player" + playerNo +" :");
    }

    public static void getBoardSizeMessage(int index)
    {
        switch (index)
        {
            case 1:
                System.out.println("Please enter your preferred board size");
                break;
            case 2:
                System.out.println("Invalid input. Please enter a valid board size in the range of 3 to 15");
                break;
            case 3:
                System.out.println("Invalid input, board size should be an integer. Please enter a new input");
                break;
        }

    }

    public static void getWinnerMessage(String playerNumber)
    {
        System.out.println("Player"+playerNumber +" has won");
    }

    public static void getCustomWinMessage(String playerNumber, String winnerRole)
    {
        System.out.println(winnerRole+ " : player "+playerNumber +" has won");
    }
    public static void newGame()
    {
        System.out.println("Do you want to play another round");
        System.out.println("Press y/Y to play a another round");

    }

    public static void newRound()
    {
        System.out.println("New Round has started");

    }
    public static void printGameSessionSummary(int noofwinsofplayer1, String player1Name, int noofwinsofplayer2 , String player2Name)
    {
        System.out.println("player 1 : "+player1Name+" has won "+noofwinsofplayer1 + " games and player 2 : "+player2Name + " has won "+ noofwinsofplayer2 + " games");
    }

}
