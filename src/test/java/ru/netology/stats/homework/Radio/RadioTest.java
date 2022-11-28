package ru.netology.stats.homework.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void testNext(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.next();

        int expectes = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectes, actual);
    }

    @Test
    public void testPrev(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prev();

        int expectes = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectes, actual);
    }


    @Test

    public void shouldSetToMinRadio() {
        Radio radio = new Radio();

        radio.toMinLimitRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMaxRadio() {
        Radio radio = new Radio();

        radio.toMaxLimitRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void ServiceRadioStation() {
        Radio radio = new Radio();

        radio.setServiceRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.toMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.toMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testReduceVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(0);

        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}
