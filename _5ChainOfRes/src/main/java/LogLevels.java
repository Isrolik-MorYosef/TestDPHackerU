/**
 * Created by Isrolik morYossef on 6/27/2019 | 1:02 PM.
 */
public enum LogLevels {
    INFO(1), ERROR(2), FATTAL(3);

    private int value;

    LogLevels(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
