package study.racingcar;

public class Car {

    private int position;

    public Car(int position) {
        this.position = position;
    }

    public int currentPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
