public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        } else if (currentRadioStation > 9) {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else if (currentRadioStation < 0) {
            currentRadioStation = 1;
        } else {
            currentRadioStation += 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else if (currentRadioStation > 9) {
            currentRadioStation = 8;
        } else {
            currentRadioStation -= 1;
        }
    }

    public void setCurrentRadioStation(int numStation) {
        if (numStation >= 0 && numStation <=9) {
            currentRadioStation = numStation;
        }
    }


    public int currentVolume;

    public int getCurrentVolume() {
        if (currentVolume < 0) {
            currentVolume = 0;
        } else if (currentVolume > 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100 && currentVolume >= 0) {
            currentVolume += 1;
        } else if (currentVolume > 100) {
            currentVolume = 100;
        } else if (currentVolume < 0) {
            currentVolume = 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0 && currentVolume <= 100) {
            currentVolume -= 1;
        } else if (currentVolume < 0) {
            currentVolume = 0;
        } else if (currentVolume > 100) {
            currentVolume = 99;
        }
    }
}
