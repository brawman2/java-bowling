package bowling.domain;

import java.util.List;
import java.util.function.Function;

public class Balls {
	private final List<Ball> balls;

	public Balls(List<Ball> balls) {
		this.balls = balls;
	}

	public boolean isFull() {
		return false;
	}

	public void add(Ball ball) {
	}

	// public boolean isFull(Function<List<Ball>, Boolean> isFull) {
	// }
}
