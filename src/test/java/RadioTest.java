import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldInitFieldsWithEmptyConstructor() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getCountRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldInitFieldsWithArguments() {
        Radio argRadio = new Radio(20);

        Assertions.assertEquals(20, argRadio.getCountRadioStation());
        Assertions.assertEquals(0, argRadio.getMinRadioStation());
        Assertions.assertEquals(19, argRadio.getMaxRadioStation());
        Assertions.assertEquals(0, argRadio.getCurrentRadioStation());
        Assertions.assertEquals(0, argRadio.getMinVolume());
        Assertions.assertEquals(100, argRadio.getMaxVolume());
        Assertions.assertEquals(50, argRadio.getCurrentVolume());
    }

    @Test
    public void testNextRadioStationWithEmptyConstructor() {
        Radio radio = new Radio();

        radio.nextRadioStation();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());

        for (int i = 0; i < 9; i++) {
            radio.nextRadioStation();
        }

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void testNextRadioStationWithArguments() {
        Radio argRadio = new Radio(20);

        argRadio.nextRadioStation();
        Assertions.assertEquals(1, argRadio.getCurrentRadioStation());

        for (int i = 0; i < 19; i++) {
            argRadio.nextRadioStation();
        }

        Assertions.assertEquals(0, argRadio.getCurrentRadioStation());
    }

    @Test
    public void testPrevRadioStationWithEmptyConstructor() {
        Radio radio = new Radio();

        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());

        for (int i = 0; i < 9; i++) {
            radio.prevRadioStation();
        }

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void testPrevRadioStationWithArguments() {
        Radio argRadio = new Radio(20);

        argRadio.prevRadioStation();
        Assertions.assertEquals(19, argRadio.getCurrentRadioStation());

        for (int i = 0; i < 19; i++) {
            argRadio.prevRadioStation();
        }

        Assertions.assertEquals(0, argRadio.getCurrentRadioStation());
    }

    @Test
    public void positiveTestSetCurrentRadioStationWithEmptyConstructor() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void positiveTestSetCurrentRadioStationWithArguments() {
        Radio argRadio = new Radio(20);

        argRadio.setCurrentRadioStation(5);
        Assertions.assertEquals(5, argRadio.getCurrentRadioStation());
        argRadio.setCurrentRadioStation(0);
        Assertions.assertEquals(0, argRadio.getCurrentRadioStation());
        argRadio.setCurrentRadioStation(19);
        Assertions.assertEquals(19, argRadio.getCurrentRadioStation());
    }

    @Test
    public void negativeTestSetCurrentRadioStationWithEmptyConstructor() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void negativeTestSetCurrentRadioStationWithArguments() {
        Radio argRadio = new Radio(20);

        argRadio.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, argRadio.getCurrentRadioStation());
        argRadio.setCurrentRadioStation(20);
        Assertions.assertEquals(0, argRadio.getCurrentRadioStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());

        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());

        for (int i = 0; i < 50; i++) {
            radio.decreaseVolume();
        }

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
