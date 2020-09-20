package bowling.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PinTest {

    @Test
    void create() {
        Pin pin = new Pin(5);

        assertThat(pin).isEqualTo(new Pin(5));
    }

    @Test
    void rangeExceptionTest() {
        assertThatThrownBy(() -> {
            new Pin(15);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void isStrikeTest() {
        assertTrue(new Pin(10).isStrike());
    }

    @Test
    void isSpareTest() {
        Pin pin = new Pin(5);

        assertTrue(pin.isSpare(new Pin(5)));
    }
}
