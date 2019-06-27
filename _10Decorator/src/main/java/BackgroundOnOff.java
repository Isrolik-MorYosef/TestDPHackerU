public class BackgroundOnOff extends ToppingDecorator {


    public BackgroundOnOff(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public String getDetails() {

        return this.iWindow.getDetails() + " BackgroundOnOff";
    }
}
