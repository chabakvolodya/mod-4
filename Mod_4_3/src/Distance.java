/**
 * Created by Администратор on 19.12.2015.
 */
public class Distance {
    private static int x1, y1, x2, y2;

    public static void distanceTwoPoint(int x1, int y1, int x2, int y2)
    {

        double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println(result);
    }
}
