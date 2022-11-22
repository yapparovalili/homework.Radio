package ru.netology.stats.homework.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetRadio() {
        Radio cond = new Radio();

        cond.currentRadioStation = 5;

        int expected = 5;
        int actual = cond.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToMinRadio() {
        Radio cond = new Radio();

        cond.setToMinLimitRadioStation();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMaxRadio() {
        Radio cond = new Radio();

        cond.setToMaxLimitRadioStation();
        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void next() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);
        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void prev() {
        Radio cond = new Radio();

        cond.setPrevCurrentRadioStation(0);
        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ServiceRadioStation() {
        Radio cond = new Radio();

        cond.setServiceRadioStation();

        int expected = 6;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToMinVolume() {
        Radio cond = new Radio();

        cond.setToMinVolume();

        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMaxVolume() {
        Radio cond = new Radio();

        cond.setToMaxVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {
        Radio cond = new Radio();

        cond.setIncreaseVolume(10);
        int expected = 10;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldReduceVolume() {
        Radio cond = new Radio();

        cond.setReduceVolume(0);
        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
