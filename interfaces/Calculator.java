package interfaces;

public class Calculator implements Calculatable{
    int first, second, third;
    @Override
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int sum() {
        return this.first + this.second + this.third;
    }

    @Override
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}
