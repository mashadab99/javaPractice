package genericTest;

public class GenericDemo {

    public static void main(String args[]){
        System.out.println(":::::::::::::Checking Generic For Interger Types:::::::::");
        Generic <Integer> integerObj=new Generic<Integer>(88);
        integerObj.showObjectType();
        int intValue=integerObj.getObject();
        System.out.println("The Integer value is: "+intValue);

        System.out.println(":::::::::::::Checking Generic For String Types:::::::::");
        Generic<String>stringObj=new Generic<String>("I am String");
        stringObj.showObjectType();
        String stringValue=stringObj.getObject();
        System.out.println("The String value is: "+stringValue);

    }


}
