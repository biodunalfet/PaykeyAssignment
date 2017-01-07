package demo.paykey.paykeyassignment;

import java.util.List;
import java.util.SortedSet;

/**
 * Created by alexy on 07.01.2017.
 */

public interface CalculatorContract {
    interface View {
        void showResult(String result);
        void showError(SortedSet<Integer> errorPositions);
        void onHistoryLoaded(List<String> history);
    }

    interface Presenter {
        void evaluate(String input);
        void loadHistory();
    }
}
