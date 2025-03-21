public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
public class Main {
    public static void main(String[] args) {
        


        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(x:5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Rectangle r1 =new Rectangle(p3, 4,5);

        System.out.println(r1.setSideA());
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.area());

    }
} 