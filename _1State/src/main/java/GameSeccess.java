/**
 * Created by Isrolik morYossef on 6/27/2019 | 10:20 AM.
 */
public class GameSeccess extends GameStates {

    private int level;
    private int points;

    public GameSeccess(Context context) {
        super(context);
    }

    @Override
    public GameStates newGame() {
        System.out.println("game Success Start new Game");

        return context.gameStates = new NewGame(context);
    }

    @Override
    public GameStates warningMode() {
        System.out.println("game Success Start new Game");

        return context.gameStates = new NewGame(context);
    }

    @Override
    public GameStates rocketShip() {
        System.out.println("game Success Start new Game");

        return context.gameStates = new NewGame(context);
    }

    @Override
    public GameStates gameSeccess() {
        System.out.println("game Success Start new Game");

        return context.gameStates = new NewGame(context);
    }

    @Override
    public GameStates gameOver() {
        System.out.println("game Success Start new Game");

        return context.gameStates = new NewGame(context);
    }
}
