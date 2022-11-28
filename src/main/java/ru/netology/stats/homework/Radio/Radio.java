package ru.netology.stats.homework.Radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;


    public void toMinLimitRadioStation() {
        currentRadioStation = 0;
    }

    public void toMaxLimitRadioStation() {
        currentRadioStation = 9;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setServiceRadioStation() {
        currentRadioStation = 6;

    }


    public void toMinVolume() {
        currentVolume = 0;
    }

    public void toMaxVolume() {
        currentVolume = 10;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setIncreaseVolume(int сurrentVolume) {
        if (сurrentVolume < 0) {
            return;
        }
        if (сurrentVolume > 10) {
            return;
        }
        this.currentVolume = сurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume < 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
