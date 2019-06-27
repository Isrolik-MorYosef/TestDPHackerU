import java.util.ArrayList;
import java.util.List;

public class build {

	
	private List<String> hardwares = new ArrayList<String>();

	public build() {

	}
	
	public void addbox(String box)
	{
		hardwares.add(box);
	}
	public void addMBord(String m)
	{
		hardwares.add(m);
	}
	public void addProsseor(String prosc)
	{
		hardwares.add(prosc);
	}
	public void addgragiCars(String cardG)
	{
		hardwares.add(cardG);
	}
	public void addmemoryCard(String memory)
	{
		hardwares.add(memory);
	}
	public void runTest(String run)
	{
		hardwares.add(run);
	}


	
	
}
