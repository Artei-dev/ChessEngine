import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {
    protected boolean isMoveLegal(List<Coordinates> moves, Coordinates expectedMove) {
        for(Coordinates move : moves) {
            if (move.equals(expectedMove)) {
                return true;
            }
        }
        return false;
    }

}