package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CounterTest {

    @Test
    void whenStart0finish10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3finish8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1finish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5finish3Then0() {
        int start = 5;
        int finish = 3;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0finish100Then5050() {
        int start = 0;
        int finish = 100;
        int expected = 5050;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}
