public class Saddow extends ToppingDecorator {


    public Saddow(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public String getDetails() {

        return this.iWindow.getDetails() + " Saddow";
    }
}
