package ru.job4j.converter;
public class Converter {

    public static float rubleToEuro(float rubles) {
        float euroRate = 90;  // Курс рубля к евро
        return rubles / euroRate;
    }

    public static float rubleToDollar(float rubles) {
        float dollarRate = 75;  // Курс рубля к доллару
        return rubles / dollarRate;
    }
}
