package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int pressNumber;
    private int currentVolume;

    public int getPressNumber() {
        return pressNumber;
    }

    public void setPressNumber(int pressNumber) {
        this.pressNumber = pressNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void stationNumberNext(int currentNumber) {

        if (currentNumber == 9) {
            currentStation = 0;
            return;
        }
        currentStation = currentNumber + 1;
        return;
    }

    public void stationNumberPrev() {
        if (currentStation == 0)
            currentStation = 10;
        currentStation--;
        return;
    }

    public void stationVolumeUp() {
        if (currentVolume >= 10) {
            currentVolume = 10;
            return;
        } else {
            currentVolume++;
            return;
        }
    }

    public void stationVolumeDown() {
        if (currentVolume <= 0) {
            currentVolume = 0;
            return;
        } else {
            currentVolume--;
            return;
        }
    }

}








