package bowling.view;

import bowling.domain.FrameMark;
import bowling.domain.Name;

import java.util.List;
import java.util.stream.IntStream;

public class ResultView {
    private static final String PRINT_FORMAT = "  %-4s";
    private static final String SCORE_HEADER = "| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |";
    private static final String DELIMETER = "|";
    private static final String BLANK = "";
    private static final int UN_COUNTABLE_SCORE = -1;

    public void printMark(Name name, List<FrameMark> frameMarks) {
        System.out.println(SCORE_HEADER);
        System.out.print(DELIMETER);

        System.out.printf(PRINT_FORMAT, name.name());
        frameMarks.stream()
                .map(FrameMark::marks)
                .map(marks -> String.join(DELIMETER, marks))
                .forEach((mark) -> System.out.print(DELIMETER + String.format(PRINT_FORMAT, mark)));

        System.out.println(DELIMETER);
    }

    public void printScore(List<Integer> scores) {
        System.out.print(DELIMETER);

        System.out.printf(PRINT_FORMAT, BLANK);
        IntStream.range(0, scores.size())
                .mapToObj((i) -> changeScoreFormat(i, scores))
                .forEach((score) -> System.out.print(DELIMETER + String.format(PRINT_FORMAT, score)));

        System.out.println(DELIMETER);
    }

    private String changeScoreFormat(int currentIndex, List<Integer> scores) {
        if (scores.get(currentIndex) == UN_COUNTABLE_SCORE) {
            return BLANK;
        }

        return String.valueOf(scores.stream()
                .limit(currentIndex + 1)
                .mapToInt(Integer::intValue)
                .sum());
    }
}
