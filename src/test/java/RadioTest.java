import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testGetCurrent() {
        Radio service = new Radio();

        Assertions.assertEquals(0, service.getCurrentRadioStation());
        Assertions.assertEquals(50, service.getCurrentVolume());
    }

    @Test
    public void testNextRadioStation() {
        Radio service = new Radio();

        service.nextRadioStation();
        Assertions.assertEquals(1, service.getCurrentRadioStation());

        for (int i = 0; i < 9; i++) {
            service.nextRadioStation();
        }
        Assertions.assertEquals(0, service.getCurrentRadioStation());
    }

    @Test
    public void testPrevRadioStation() {
        Radio service = new Radio();

        service.prevRadioStation();
        Assertions.assertEquals(9, service.getCurrentRadioStation());

        for (int i = 0; i < 9; i++) {
            service.prevRadioStation();
        }
        Assertions.assertEquals(0, service.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationFirst() {
        Radio service = new Radio();

        service.setCurrentRadioStation(5);
        Assertions.assertEquals(5, service.getCurrentRadioStation());
        service.setCurrentRadioStation(0);
        Assertions.assertEquals(0, service.getCurrentRadioStation());
        service.setCurrentRadioStation(9);
        Assertions.assertEquals(9, service.getCurrentRadioStation());
        service.setCurrentRadioStation(-1);
        Assertions.assertEquals(9, service.getCurrentRadioStation());
        service.setCurrentRadioStation(10);
        Assertions.assertEquals(9, service.getCurrentRadioStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio service = new Radio();

        service.increaseVolume();
        Assertions.assertEquals(51, service.getCurrentVolume());

        for (int i = 0; i < 50; i++) {
            service.increaseVolume();
        }
        Assertions.assertEquals(100, service.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio service = new Radio();

        service.decreaseVolume();
        Assertions.assertEquals(49, service.getCurrentVolume());

        for (int i = 0; i < 50; i++) {
            service.decreaseVolume();
        }
        Assertions.assertEquals(0, service.getCurrentVolume());
    }
}
