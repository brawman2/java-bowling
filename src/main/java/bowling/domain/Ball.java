package bowling.domain;

public class Ball {
	private final int number;

	public Ball(int number) {
		if(number > 10 || number < 0) {
			throw new IllegalArgumentException(number + "는 0 ~ 10의 범위를 벗어납니다.");
		}
		this.number = number;
	}

	public Ball add(Ball other) {
		return new Ball(this.number + other.number);
	}
}
