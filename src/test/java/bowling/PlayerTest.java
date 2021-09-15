package bowling;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bowling.domain.Player;

public class PlayerTest {

	@Test
	@DisplayName("사람 이름은 영문 3자 이다.")
	void name() {
		assertThatThrownBy(() -> {
			new Player("hi");
		}).isExactlyInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> {
			new Player("한글로");
		}).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
