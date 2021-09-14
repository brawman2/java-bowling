package bowling.ui;

import java.util.List;

public class ResultView {
	public void drawResult(String name) {
		System.out.println("| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |");

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(String.format("|  %s |", name));

		stringBuffer.append(String.format("  8|/ |", name));

		System.out.println(stringBuffer);
	}
}
