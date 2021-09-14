package bowling;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bowling.domain.NormalFrame;

public class FrameTest {

	// @Test
	// @DisplayName("스트라이크")
	// void strike() {
	// 	NormalFrame frame = new NormalFrame(10);
	//
	// 	assertThat(frame.isComplete()).isTrue();
	// }
	//
	// @Test
	// @DisplayName("스페어")
	// void spare() {
	// 	NormalFrame frame = new NormalFrame(9);
	//
	// 	assertThat(frame.isComplete()).isFalse();
	//
	// 	NormalFrame second = frame.makeNextFrame(1);
	//
	// 	assertThat(second.isComplete()).isTrue();
	// }
	//
	// @Test
	// @DisplayName("미스")
	// void miss() {
	// 	NormalFrame frame = new NormalFrame(9);
	//
	// 	assertThat(frame.isComplete()).isFalse();
	//
	// 	NormalFrame second = frame.makeNextFrame(0);
	//
	// 	assertThat(second.isComplete()).isTrue();
	// }
	//
	// @Test
	// @DisplayName("거너")
	// void gutter() {
	// 	NormalFrame frame = new NormalFrame(0);
	//
	// 	assertThat(frame.isComplete()).isFalse();
	//
	// 	NormalFrame second = frame.makeNextFrame(0);
	//
	// 	assertThat(second.isComplete()).isTrue();
	// }
}
