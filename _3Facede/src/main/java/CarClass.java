/**
 * Created by Isrolik morYossef on 6/27/2019 | 12:35 PM.
 */
public class CarClass {

    public Car car;

    public CarClass(Car car) {
        this.car = car;
    }

    public void CarFasede(){
        this.car = new CarImplements();
    }

    public void showLocation(){
        this.car.showLocation();
    }

    public void showGas(){
        this.car.showGas();
    }
}
