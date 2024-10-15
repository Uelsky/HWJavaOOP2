public class Radio {
    private int countRadioStation = 10;
    private final int minRadioStation = 0;
    private int maxRadioStation = countRadioStation - 1;
    private int currentRadioStation = minRadioStation;

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.maxRadioStation = countRadioStation - 1;
    }

    public Radio() {
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation += 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation -= 1;
        }
    }

    public void setCurrentRadioStation(int numStation) {
        if (numStation >= minRadioStation && numStation <= maxRadioStation) {
            currentRadioStation = numStation;
        }
    }


    private final int minVolume = 0;
    private final int maxVolume = 100;
    private  int currentVolume = 50;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }
}
