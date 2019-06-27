import javax.naming.OperationNotSupportedException;

/**
 * Created by hackeru on 6/24/2019.
 */
public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        Component root = new Composite(1);
        Component circleRoot = new Leaf(15);
        root.addChild(circleRoot);


        root.sum(5);
        System.out.println("-----isBinary?------");
        isBinary(root);


    }

    // Recorcivy
    private static boolean isBinary(Component c){
        if(!c.isBinary()){
            System.out.println("is not dual");
            return false;
        } if(c.getChilds() != null && c.getChilds().size() % 2 == 0) {
           return isBinary(c.getChilds().get(0)) && isBinary(c.getChilds().get(0));
        }
        System.out.println("is dual");
        return true;

    }
}
