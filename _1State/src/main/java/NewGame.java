/**
 * Created by Isrolik morYossef on 6/27/2019 | 10:14 AM.
 */
public class NewGame extends GameStates {

    public NewGame(Context context) {
        super(context);
    }

    @Override
    public GameStates newGame() {
        return context.gameStates = new NewGame(context);
    }

    @Override
    public GameStates warningMode() {
        if(context.level < 2){
            return context.gameStates = new WarningMode(context);
        }
        return context.gameStates = new RocketShipValid(context);
    }

    @Override
    public GameStates rocketShip() {
        return context.gameStates = new RocketShipValid(context);
    }

    @Override
    public GameStates gameSeccess() {
        if (context.level > 3){
            return context.gameStates = new GameSeccess(context);
        }
        return context.gameStates = new RocketShipValid(context);
    }

    @Override
    public GameStates gameOver() {
        if (context.points > 50){
            return context.gameStates = new GameOver(context);
        }
        return context.gameStates = new RocketShipValid(context);
    }
}
