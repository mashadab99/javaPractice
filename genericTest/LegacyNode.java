package genericTest;

public class LegacyNode {
    //The value in a Node
    private  Object data;

    //The reference to next Node
    private  LegacyNode nextNode;

    public LegacyNode(Object data, LegacyNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public LegacyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LegacyNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "LegacyNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
        //return this.data + (this.next == null? "" : ", " + this.next);
    }

    public static void main(String args[]){

        /*The class LegacyNode can be used to create a linked list with arbitrary objects:*/
        /* (Integer, null)
        Note:- Primitive values are encapsulated in corresponding wrapper objects.
        So here 4 is wrapped to Integer Object*/
        LegacyNode node1 = new LegacyNode(4, null);
        // (String, Integer, null)
        LegacyNode node2 = new LegacyNode("July", node1);

        //Retrieve the data from a node, this object is returned via an Object reference:
        Object object1=node1.getData();
        Object object2=node2.getData();

        /**
         * In order to access type-specific properties or behavior of the fetched object, the ref-
         * erence value in the Object reference must be converted to the right type. To avoid
         * a ClassCastException at runtime when applying the cast, we must make sure that
         * the object referred to by the Object reference is of the right type:
         * */

        if(object1 instanceof String){
            String str = (String) object1;
            System.out.println("object1::::"+str.toUpperCase());
        }else  if (object1 instanceof Integer){
            Integer integer = (Integer) object1;
            System.out.println("object1::::"+integer.intValue());
        }

        if(object2 instanceof String){
            String str = (String) object2;
            System.out.println("object2::::"+str.toUpperCase());
        }else  if (object2 instanceof Integer){
            Integer integer = (Integer) object2;
            System.out.println("object2::::"+integer.intValue());
        }
    }
}
