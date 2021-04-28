package bowling.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrameMarkTest {

    @Test
    @DisplayName("프레임과 해당 프레임의 인덱스를 인자로 가지는 프레임 결과 객체를 생성한다.")
    public void create() throws Exception {
        FrameMark frameMark = new FrameMark(new NormalFrame(0));
        assertThat(frameMark).isEqualTo(new FrameMark(new NormalFrame(0)));
    }
}