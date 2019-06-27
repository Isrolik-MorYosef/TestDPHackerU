/**
 * Created by Isrolik morYossef on 6/27/2019 | 10:06 AM.
 */
public abstract class GameStates {

    protected Context context;

    public GameStates(Context context) {
        this.context = context;
    }

    public abstract GameStates newGame();
    public abstract GameStates warningMode();
    public abstract GameStates rocketShip();
    public abstract GameStates gameSeccess();
    public abstract GameStates gameOver();
}
