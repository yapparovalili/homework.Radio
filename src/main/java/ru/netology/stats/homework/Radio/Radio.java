package ru.netology.stats.homework.Radio;

public class Radio {

    private int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;


    public Radio() {
        maxRadioStation = 9;
        minRadioStation = 0;
        minVolume = 0;
        maxVolume = 100;
    }

    public Radio(int stationsCount){
        maxRadioStation = stationsCount - 1;

    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }


    public void toMinLimitRadioStation() {
        currentRadioStation = minRadioStation;
    }

    public void toMaxLimitRadioStation() {
        currentRadioStation = maxRadioStation;
    }


    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
            return;
        }
        currentRadioStation = minRadioStation;
    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setServiceRadioStation() {
        currentRadioStation = 6;

    }


    public void toMinVolume() {
        currentVolume = 0;
    }

    public void toMaxVolume() {
        currentVolume = maxVolume;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setIncreaseVolume(int сurrentVolume) {
        if (сurrentVolume < minVolume) {
            return;
        }
        if (сurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = сurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}
