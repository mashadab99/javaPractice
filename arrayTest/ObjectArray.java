package arrayTest;

/**
 * JAVA ARRAY OF OBJECT, as defined by its name, stores an array of objects.
 * Unlike a traditional array that store values like string, integer, Boolean, etc
 * an array of objects stores OBJECTS.
 * The array elements store the location of the reference variables of the object
 * Syntax:
 * Class obj[]= new Class[array_length]
 * ****/
public class ObjectArray {
    public static void main(String args[]){
        //approch1();
        approch2();
    }

    private static void approch2() {
        Account account1=new Account();
        account1.setData(1,2);
        Account account2=new Account();
        account2.setData(3,4);

        Account obj[] = new Account[2] ;
        obj[0] = account1;
        obj[1] = account2;
        print(obj);
    }

    private static void approch1() {
        Account obj[] = new Account[2] ;
        obj[0] = new Account();
        obj[1] = new Account();
        obj[0].setData(1,2);
        obj[1].setData(3,4);
        print(obj);
    }

    private static void print(Account[] obj) {
        System.out.println("For Array Element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();
    }
}
class Account{
    int a;
    int b;
    public void setData(int c,int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println("Value of a ="+a);
        System.out.println("Value of b ="+b);
    }
}
