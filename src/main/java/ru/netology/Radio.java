package ru.netology;
public class Radio {
    private int minChannelNumber = 0;
    private int maxChannelNumber = 9;
    private int currentChannelNumber;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    //GET
    public int getCurrentChannelNumber() {
        return currentChannelNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // SET
    public void setCurrentChannelNumber(int currentChannelNumber) {
        if (currentChannelNumber > maxChannelNumber) {
            return;
        }
        if (currentChannelNumber < minChannelNumber) {
            return;
        }
        this.currentChannelNumber = currentChannelNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseChannelNumber() {
        if (currentChannelNumber < maxChannelNumber) {
            currentChannelNumber++;
        } else {
            currentChannelNumber = minChannelNumber;
        }
    }

    public void decreaseChannelNumber() {
        if (currentChannelNumber > minChannelNumber) {
            currentChannelNumber--;
        } else {
            currentChannelNumber = maxChannelNumber;
        }
    }
}