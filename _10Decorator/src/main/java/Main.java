
public class Main {

	public static void main(String[] args) {

		IWindow basePizza = new BasePizza();
		System.out.println(basePizza);

		IWindow d3 = new D3(basePizza);
		System.out.println(d3.getDetails());

		IWindow backgroundOnOffAndColors = new BackgroundOnOff(new ColorsFrame(new BasePizza()));
		System.out.println(backgroundOnOffAndColors.getDetails());
	}

}
