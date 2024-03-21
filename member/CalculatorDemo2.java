package member;

public class CalculatorDemo2 {

    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        c2.sum();

        Calculator2.base = 10;
        c1.sum();
        c2.sum();
    }
}

class Calculator2 {
    static final double PI = 3.14;
    // 클래스 변수인 base가 추가되었다.
    static int base = 0;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}