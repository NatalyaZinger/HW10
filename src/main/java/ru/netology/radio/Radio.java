package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int amountStation = 10;

    public Radio() {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = minStation;
        this.amountStation = amountStation;
    }

    public Radio(int stationAmount) {
        maxStation = minStation + stationAmount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else currentStation = minStation;
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
