package access;

class A {
    public String y() {
        return "public String y()";
    }

    private String z() {
        return "public String z()";
    }

    public String x() {
        return z();
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());
    }
}
