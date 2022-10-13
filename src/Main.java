import java.util.Scanner;

import static message.Messenger.chooseGame;

public class Main {

    public static Scanner scanner;

    public static void main(String[] args)
    {
        chooseGame();
        while (true)
        {
            scanner = new Scanner(System.in);
            String gamechoice = scanner.nextLine();
            TicTacToeRunner runner;
            if (gamechoice.equalsIgnoreCase("t"))
            {
                 runner= new TicTacToeRunner();
                 runner.start();
            }
            else if (gamechoice.equalsIgnoreCase("o")) {
                runner = new OrderAndChaosRunner();
                runner.start();
            }
            else {
                System.out.println("Invalid key entered. Please enter a key among t/T/o/O");
                continue;
            }

        }

    }
}