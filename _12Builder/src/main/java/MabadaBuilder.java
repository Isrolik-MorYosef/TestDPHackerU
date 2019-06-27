
public abstract class MabadaBuilder {
	
	protected build mabada;
	
	public build getMabadaBuilder()
	{
		return this.mabada;
	}
	
	public void buildComputer()
	{
		this.mabada = new build();
		addbox();
		addMBord();
		addProsseor();
		addgragiCars();
		addmemoryCard();
		runTest();
	}
	
	protected abstract void addbox();

	protected abstract void addMBord();

	protected abstract void addProsseor();

	protected abstract void addgragiCars();

	protected abstract void addmemoryCard();

	protected abstract void runTest();

}
