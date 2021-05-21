package genericTest;

public class Generic <T>{

    T object;

    public Generic(T obj) {
        object = obj;
    }

    public T getObject() {
        return object;
    }

    public void showObjectType(){
        System.out.println("The T object type is : "+object.getClass().getName());
    }
}
