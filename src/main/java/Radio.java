public class Radio {
    private int currentRadioStation = 0;
    private int currentVolume = 50;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation += 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation -= 1;
        }
    }

    public void setCurrentRadioStation(int numStation) {
        if (numStation >= 0 && numStation <=9) {
            currentRadioStation = numStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
