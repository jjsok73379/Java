package constant;

enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor() {
        return this.color;
    }
    Fruit(String color) {
        this.color = color;
    }
}

enum Company {
    GOOGLE, APPLE, ORACLE;
}

/*
// switch문 사용 불가
class Fruit {
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

// FRUIT의 APPLE과 COMPANY의 APPLE이 같을 수 있다.
interface FRUIT {
    int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}
*/

public class ConstantDemo3 {
    public static void main(String[] args) {

        for (Fruit f : Fruit.values()) {
            System.out.println(f);
        }
    }
}
