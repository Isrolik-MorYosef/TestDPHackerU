public class D3 extends ToppingDecorator {


    public D3(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public String getDetails() {

        return this.iWindow.getDetails() + " D3";
    }
}
