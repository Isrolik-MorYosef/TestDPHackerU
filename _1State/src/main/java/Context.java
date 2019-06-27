/**
 * Created by Isrolik morYossef on 6/27/2019 | 10:12 AM.
 */
public class Context {

    public int level;
    public int points;

    GameStates gameStates = null;

    public Context(int level, int points, GameStates gameStates) {
        this.level = level;
        this.points = points;
        this.gameStates = gameStates;
    }

    public void gameOver(){
        this.gameStates.gameOver();
    }

    public void gameSuccess(){
        this.gameStates.gameSeccess();
    }

    public void newGame(){
        this.gameStates.newGame();
    }

    public void rocketShipValid(){
        this.gameStates.rocketShip();
    }

    public void warningMode(){
        this.gameStates.warningMode();
    }
}
