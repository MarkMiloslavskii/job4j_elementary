package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float rubles) {
        float euroRate = 90;
        return rubles / euroRate;
    }

    public static float rubleToDollar(float rubles) {
        float dollarRate = 80;
        return rubles / dollarRate;
    }
}
