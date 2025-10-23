class Parent{
         static void display(){
            System.out.println("This is Parent class's method");
        }
}

class Child extends  Parent{
     static void display(){
        System.out.println("This is Child class's method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent p1 = new Child();
        p.display();
        p1.display();
    }
}


/// Methodlar static oldugu ucun override
/// olunmur mehz buna gorede super class methodu compile and run edilir