package ru.netology.stats.homework.Radio;

public class Radio {

    public int currentRadioStation;

    public void setToMinLimitRadioStation(){
        currentRadioStation = 0;

    }

    public void setToMaxLimitRadioStation(){
        currentRadioStation = 9;

    }

    public int getCurrentRadioStation(){
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int nextCurrentRadioStation){
        if (nextCurrentRadioStation > 9){
            return;
        }
        if (nextCurrentRadioStation > 0){
            nextCurrentRadioStation = nextCurrentRadioStation + 1;
        }
        currentRadioStation = nextCurrentRadioStation;

    }


    public void setPrevCurrentRadioStation(int prevCurrentRadioStation) {
        if (prevCurrentRadioStation <= 0){
            currentRadioStation = prevCurrentRadioStation = 9;
        }
        if (prevCurrentRadioStation < 9) {

            currentRadioStation = prevCurrentRadioStation - 1;
        }
    }
    public void setServiceRadioStation(){
        currentRadioStation = 6;

    }

    public int currentVolume;

    public void setToMinVolume(){
        currentVolume = 0;

    }

    public void setToMaxVolume(){
        currentVolume = 10;

    }

    public int getCurrentVolume(){

        return currentVolume;
    }

    public void setIncreaseVolume(int increaseCurrentVolume) {
        if (increaseCurrentVolume >= 10){
            currentVolume = 10;
        }
        if (increaseCurrentVolume < 10) {
            currentVolume = increaseCurrentVolume + 1;
        }

    }

    public void setReduceVolume(int reduceCurrentVolume) {
        if (reduceCurrentVolume <= 0){
            currentVolume = 0;
        }

    }

}
