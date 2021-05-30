package genericTest;

public class GenericNode <T>{

    T data;
    GenericNode<T> nextNode;

    public GenericNode(T data, GenericNode<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(GenericNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public static void main(String args[]){

        GenericNode <Integer>integerGenericNode=new GenericNode<Integer>(4,null);
        /**
         * error: incompatible types: GenericNode<Integer> cannot be converted to GenericNode<String>
         *                 new GenericNode<String>("Ashif",integerGenericNode);
        GenericNode <String>stringGenericNode=
                new GenericNode<String>("Ashif",integerGenericNode);
         */
    }
}
