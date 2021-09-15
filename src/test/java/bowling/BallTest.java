package bowling;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bowling.domain.Ball;

public class BallTest {
	@Test
	@DisplayName("공은 0 ~ 10까지의 숫자로 구성된다.")
	void test() {
		assertThatThrownBy(() -> {
			new Ball(-1);
		}).isExactlyInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> {
			new Ball(11);
		}).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
