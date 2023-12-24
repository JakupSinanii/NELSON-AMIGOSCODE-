import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Pas by value with Objects

        Point pointA=new Point(10,10);

        Point pointB= pointA;

        pointA.x=123;
        System.out.println(pointA);
        System.out.println(pointB);

        System.out.println("Hello world!");
    }
}