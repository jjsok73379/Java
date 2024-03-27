package polymorphism;

interface I2 {
    public String A();
}

interface I3 {
    public String B();
}

class D implements I2, I3 {
    @Override
    public String A() {
        return "A";
    }

    @Override
    public String B() {
        return "B";
    }
}

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        System.out.println(obj.A()); // A
        System.out.println(obj.B()); // B

        System.out.println(objI2.A()); // A
        //System.out.println(objI2.B()); // 실행 오류

        //System.out.println(objI3.A()); // 실행 오류
        System.out.println(objI3.B()); // B
    }
}
