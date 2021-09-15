package bowling.domain;

public interface Frame {
	boolean isComplete();

	Frame makeNextFrame(Ball ball);
}
