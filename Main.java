public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(20, 0);
        System.out.println(bicycle.getDirection());
        bicycle.turnLeft();
        System.out.println(bicycle.getDirection());
        bicycle.turnLeft(10);
        System.out.println(bicycle.getDirection());
        bicycle.turnRight(450);
        System.out.println(bicycle.getDirection());
        bicycle.turnRight();
        System.out.println(bicycle.getDirection());

        Bicycle bicycle2 = new Bicycle(30, 0);
        System.out.println(bicycle2.compareTo(bicycle));
    }
}
