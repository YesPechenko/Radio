package ru.netology;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = ((maxRadioStation + minRadioStation) / 2) ;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = ((maxVolume + minVolume) / 2);

    public Radio(int currentRadioStation, int currentVolume) {
        this.currentRadioStation = currentRadioStation;

        this.currentVolume = currentVolume;
    }


   public Radio() {
   }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
            if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        // здесь уверены, что все проверки прошли
         this.currentRadioStation = currentRadioStation;
    }
    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentVolume = currentVolume;
    }

    public void plusVolume () {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void minusVolume () {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
