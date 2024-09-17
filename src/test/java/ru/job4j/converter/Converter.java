package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float rubles) {
        float euroRate = 90;
        return rubles / euroRate;
    }

    public static float rubleToDollar(float rubles) {
        float dollarRate = 75;
        return rubles / dollarRate;
    }
}
