public class Main {
    public static void main(String[] args) {
        Point point = new Point(4.5f,5.5f);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(4.5f, 5.6f,8.9f,4.f);
//        movablePoint.move();
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
