/**
 * Created by Администратор on 19.12.2015.
 */
public class Loader {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        triangle.area(50.0, 30.0);
        circle.area(20.0);
        rectangle.area(2.0, 3.0);
    }
}
