import message.Messenger;
import player.Player;

import static message.Messenger.getBoardSizeMessage;

public class OrderAndChaosRunner extends TicTacToeRunner{

    @Override
    public void setBoardSize() {
                boardSize=6;
    }

    @Override
    public int playersMovinginTurns(int playerId)
    {
        if (playerId==1)
        {
            this.player1.processOCPlayerMove(this.ticTacToeBoard);
            playerId=2;   // players moving in turns
        } else if (playerId==2)
        {
            this.player2.processOCPlayerMove(this.ticTacToeBoard);
            playerId=1;
        }
        totalNoofPostionsOccupied++;
        return playerId;
    }

    @Override
    public Player.gameStatus getGameStatus() {
        Player.gameStatus gameStatus = this.ticTacToeBoard.orderandchaoswinCheck();
        return gameStatus;
    }

    @Override
    public void welcomeGame() {
        Messenger.welcomeOACMessage();
    }


}
