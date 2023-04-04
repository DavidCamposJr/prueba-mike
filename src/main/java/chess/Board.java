package chess;

import java.util.List;

public class Board {
    private static final int LENGHT_X = 7;
    private static final int LENGHT_Y = 7;
    private final List<Queen> queens;

    public Board(List<Queen> queens) {
        this.queens = queens;
    }

    public void validateColissions() {
        for(int i = 0; i< queens.size() - 1; ++i) {
            Queen queen = queens.get(i);
            for(int j = i+1; j < queens.size(); ++j) {
                Queen adversary = queens.get(j);
                queen.validateColission(adversary);
            }
        }
    }

}
