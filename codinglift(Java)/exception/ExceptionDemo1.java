package exception;

class A {
    private int[] arr = new int[3];
    A() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second) {
        try {
            System.out.println(arr[first] / arr[second]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException e : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException e : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception e : " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);
        a.z(1, 0);
        a.z(2, 1);
    }
}
