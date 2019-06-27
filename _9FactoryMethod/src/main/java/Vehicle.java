
public abstract class Vehicle {
	
	private String tin;
	private String wheel;
	private String seats;


	public Vehicle(String tin, String wheel, String seats) {
		this.tin = tin;
		this.wheel = wheel;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"tin='" + tin + '\'' +
				", wheel='" + wheel + '\'' +
				", seats='" + seats + '\'' +
				'}';
	}
}
