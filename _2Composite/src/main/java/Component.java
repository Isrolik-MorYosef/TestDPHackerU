import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * Created by hackeru on 6/24/2019.
 */
public abstract class Component {

    protected int num;

    public abstract void addChild(Component c )throws OperationNotSupportedException;
    public abstract void removeChild(Component c)throws OperationNotSupportedException;;
    public abstract List<Component> getChilds();

    public abstract void sum(int number);

    public Component(int name) {
        this.num = name;
    }

    public abstract boolean isBinary();
}
