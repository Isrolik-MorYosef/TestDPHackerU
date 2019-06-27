
public class Main {

	public static void main(String[] args) {

		MabadaBuilder gameComputer = new GameComputer();
		MabadaBuilder officeComputer = new OfficeComputer();


		gameComputer.buildComputer();
		officeComputer.buildComputer();
		
		build computer = gameComputer.getMabadaBuilder();

	}

}
