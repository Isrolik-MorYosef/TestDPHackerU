/**
 * Created by Isrolik morYossef on 6/27/2019 | 11:24 AM.
 */
public class Automat extends  Vehicle {

    private String engine;
    private String oolingSystem;
    private String lightingSystem;
    private String battery;


    public Automat(String tin, String wheel, String seats, String engine, String oolingSystem, String lightingSystem, String battery) {
        super(tin, wheel, seats);
        this.engine = engine;
        this.oolingSystem = oolingSystem;
        this.lightingSystem = lightingSystem;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Automat{" +
                "engine='" + engine + '\'' +
                ", oolingSystem='" + oolingSystem + '\'' +
                ", lightingSystem='" + lightingSystem + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
