public class Bicycle extends Vehicle implements Turnable, Comparable<Bicycle> {
    private final int wheelSize;
    private int direction;

    public Bicycle(int wheelSize, int direction) {
        this.wheelSize = wheelSize;
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        if (direction - 90 < 0) {
            this.direction = 360 + direction - 90;
        } else {
            this.direction -= 90;
        }
    }

    @Override
    public void turnRight() {
        if (direction + 90 > 360) {
            direction = (direction + 90) % 360;
        } else {
            this.direction += 90;
        }

    }

    @Override
    public void turnLeft(int axis) {
        if (axis > 360) {
            axis = axis % 360;
        }
        if (direction - axis < 0) {
            direction = 360 + direction - axis;
        } else {
            this.direction -= axis;
        }
    }

    @Override
    public void turnRight(int axis) {
        if (axis > 360) {
            axis = axis % 360;
        }
        if (direction + axis > 360) {
            direction = (direction + axis) % 360;
        } else {
            this.direction += axis;
        }
    }

    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public int compareTo(Bicycle o) {
        return this.wheelSize - o.wheelSize;
    }
}

