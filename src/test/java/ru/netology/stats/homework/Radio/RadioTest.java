package ru.netology.stats.homework.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void testStationsCount(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void testNext(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryNext(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxNext(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(10);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testPrev(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryPrev(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinPrev(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(- 1);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
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

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testBoundaryIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMaxIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(101);

        radio.increaseVolume();

        int expected = 1;
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

    @Test

    public void testBoundaryReduceVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(1);

        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMinReduceVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(- 1);

        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}
