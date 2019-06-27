/**
 * Created by Isrolik morYossef on 6/27/2019 | 1:47 PM.
 */
public abstract class template  {
    protected abstract void replacementoftrainingclothes();
    protected abstract void drinkWater();
    protected abstract void executeExercise();
    protected abstract void shower();

    public void run()
    {
        replacementoftrainingclothes();
        drinkWater();
        executeExercise();
        shower();
    }
}
