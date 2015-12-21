/**
 * Created by Администратор on 19.12.2015.
 */
public class TemperatureConverter {

    private static float temp;
    private static float result;

    public static void fahrenheitToCelsius(float temp)
    {
        result = (temp - 32) * 5 / 9;
        System.out.println(result);
    }

    public static void celsiusToFahrenheit(float temp)
    {
        result = temp * 9 / 5 + 32;
        System.out.println(result);
    }
}
