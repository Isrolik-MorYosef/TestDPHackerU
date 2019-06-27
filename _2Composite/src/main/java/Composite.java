import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 6/24/2019.
 */
public class Composite extends Component {

    List<Component> childern = new ArrayList<Component>();

    public Composite(int num) {
        super(num);
    }

    @Override
    public boolean isBinary() {
        if (this.childern.size() == 0 || this.childern.size() %2== 0){
            return true;
        }
        return false;
    }

    @Override
    public void addChild(Component c) {
        childern.add(c);
    }

    @Override
    public void removeChild(Component c) {
        childern.remove(c);
    }

    @Override
    public List<Component> getChilds() {
        return childern;
    }

    @Override
    public void sum(int number) {
        System.out.println(number + this.num);
        for (Component c : childern) {
            c.sum(number);
        }
    }
}
