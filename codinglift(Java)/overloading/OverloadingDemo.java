package overloading;

public class OverloadingDemo {
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }

    void A() {
        System.out.println("void A()");
    }

    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }

    void A(String arg1) {
        System.out.println("void A(String arg1)");
    }

    /*
    int A() {
        System.out.println("int A()");
    }
    */
}
