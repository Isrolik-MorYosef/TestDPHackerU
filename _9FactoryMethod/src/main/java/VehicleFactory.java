import java.util.Date;

public class VehicleFactory {

	public Vehicle CreateVehicle(String s)
	{
		if (s.toUpperCase().startsWith("H"))
		{
			return new Hibrid("Hibrid","Hibrid", "Hibrid", "Hibrid","Hibrid","Hibrid","Hibrid");
		}
		
		if (s.toUpperCase().startsWith("A")){
			return new Automat("AutomatTin","AutomatWheel", "AutomatSeats", "AutomatEngine","AutomatCooling","AutomatLight","AutomatBattary");

		}
		return null;
	}

}
