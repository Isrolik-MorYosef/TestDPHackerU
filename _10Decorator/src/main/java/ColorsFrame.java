public class ColorsFrame extends ToppingDecorator {


    public ColorsFrame(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public String getDetails() {

        return this.iWindow.getDetails() + " ColorsFrame";
    }
}
