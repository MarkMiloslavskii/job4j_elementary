package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus15And13And25And63Then5Dot3() {
        Point a = new Point(0, 5);
        Point b = new Point(0, -1);
        double expected = 6;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints000And304Then5() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 0, 4);
        double expected = 5.0;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2Minus1And221Then6() {
        Point a = new Point(-2, -2, -1);
        Point b = new Point(2, 2, 1);
        double expected = 6.0;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));
    }
}

