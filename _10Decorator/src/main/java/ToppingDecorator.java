
public abstract class ToppingDecorator implements IWindow {

	protected IWindow iWindow;

	public ToppingDecorator(IWindow iWindow) {
		super();
		this.iWindow = iWindow;
	}
		
}
