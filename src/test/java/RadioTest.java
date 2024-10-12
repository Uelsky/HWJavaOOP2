import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void positiveTestGetCurrentRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = 5;
        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestGetCurrentRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 0;
        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestGetCurrentRadioStationThird() {
        Radio service = new Radio();

        service.currentRadioStation = 9;
        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestGetCurrentRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = -1;
        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestGetCurrentRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 10;
        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void positiveTestNextRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = 5;
        service.nextRadioStation();
        int expected = 6;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestNextRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 0;
        service.nextRadioStation();
        int expected = 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestNextRadioStationThird() {
        Radio service = new Radio();

        service.currentRadioStation = 9;
        service.nextRadioStation();
        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestNextRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = -1;
        service.nextRadioStation();
        int expected = 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestNextRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 10;
        service.nextRadioStation();
        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void positiveTestPrevRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = 5;
        service.prevRadioStation();
        int expected = 4;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestPrevRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 0;
        service.prevRadioStation();
        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestPrevRadioStationThird() {
        Radio service = new Radio();

        service.currentRadioStation = 9;
        service.prevRadioStation();
        int expected = 8;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestPrevRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = -1;
        service.prevRadioStation();
        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestPrevRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 10;
        service.prevRadioStation();
        int expected = 8;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void positiveTestSetCurrentRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = 3;
        service.setCurrentRadioStation(5);
        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestSetCurrentRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 3;
        service.setCurrentRadioStation(0);
        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestSetCurrentRadioStationThird() {
        Radio service = new Radio();

        service.currentRadioStation = 3;
        service.setCurrentRadioStation(9);
        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestSetCurrentRadioStationFirst() {
        Radio service = new Radio();

        service.currentRadioStation = 3;
        service.setCurrentRadioStation(-1);
        int expected = 3;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestSetCurrentRadioStationSecond() {
        Radio service = new Radio();

        service.currentRadioStation = 3;
        service.setCurrentRadioStation(10);
        int expected = 3;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

// ==============================================
    @Test
    public void positiveTestGetCurrentVolumeFirst() {
        Radio service = new Radio();

        service.currentVolume = 50;
        int expected = 50;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestGetCurrentVolumeSecond() {
        Radio service = new Radio();

        service.currentVolume = 0;
        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestGetCurrentVolumeThird() {
        Radio service = new Radio();

        service.currentVolume = 100;
        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestGetCurrentVolumeFirst() {
        Radio service = new Radio();

        service.currentVolume = -1;
        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestGetCurrentVolumeSecond() {
        Radio service = new Radio();

        service.currentVolume = 101;
        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void positiveTestIncreaseVolumeFirst() {
        Radio service = new Radio();

        service.currentVolume = 50;
        service.increaseVolume();
        int expected = 51;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestIncreaseVolumeSecond() {
        Radio service = new Radio();

        service.currentVolume = 0;
        service.increaseVolume();
        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestIncreaseVolumeThird() {
        Radio service = new Radio();

        service.currentVolume = 100;
        service.increaseVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestIncreaseVolumeFirst() {
        Radio service = new Radio();

        service.currentVolume = -1;
        service.increaseVolume();
        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestIncreaseVolumeSecond() {
        Radio service = new Radio();

        service.currentVolume = 101;
        service.increaseVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void positiveTestDecreaseVolumeFirst() {
        Radio service = new Radio();

        service.currentVolume = 50;
        service.decreaseVolume();
        int expected = 49;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestDecreaseVolumeSecond() {
        Radio service = new Radio();

        service.currentVolume = 0;
        service.decreaseVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveTestDecreaseVolumeThird() {
        Radio service = new Radio();

        service.currentVolume = 100;
        service.decreaseVolume();
        int expected = 99;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestDecreaseVolumeFirst() {
        Radio service = new Radio();

        service.currentVolume = -1;
        service.decreaseVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTestDecreaseVolumeSecond() {
        Radio service = new Radio();

        service.currentVolume = 101;
        service.decreaseVolume();
        int expected = 99;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
