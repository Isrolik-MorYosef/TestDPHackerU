
public class Main {

	public static void main(String[] args) {

		// add scanner input from user
		String automatCar = "automatCar";
		String hibridCar = "hibridCar";

		Vehicle a = new VehicleFactory().CreateVehicle(automatCar);
		Vehicle h = new VehicleFactory().CreateVehicle(hibridCar);
		System.out.println(h);
		System.out.println(a);


		

	}

}
