package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class TemperatureConverterUtils {

    private static float result;

    public static float fahrenheitToCelsius(float temp)  {
        result = (temp - 32) * 5 / 9;

        return result;
    }

    public static float celsiusToFahrenheit(float temp)  {
        result = temp * 9 / 5 + 32;

        return result;
    }
}
