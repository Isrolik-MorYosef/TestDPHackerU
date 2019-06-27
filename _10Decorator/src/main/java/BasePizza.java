
public class BasePizza implements IWindow {

	@Override
	public String getDetails() {
		return "this is base window";
	}

	@Override
	public String toString() {
		return "this is base window [" + getDetails() + "]";
	}

}
