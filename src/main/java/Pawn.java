import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    private int directionFactor(int num) {
        if (color == Color.BLACK) {
            return -num;
        }

        return num;
    }
    @Override
    public List<Coordinates> getLegalMoves() {
        List<Coordinates> legalMoves = new ArrayList<>();
        // one square forward
        legalMoves.add(position.getOffset(0, directionFactor(-1)));
        // two squares forward
        if(!hasMoved) {
            legalMoves.add(position.getOffset(0, directionFactor(-2)));
        }

        if(position.getX() != 0) {
            legalMoves.add(position.getOffset(-1, directionFactor(-1)));
        }

        if(position.getX() != 7) {
            legalMoves.add(position.getOffset(1, directionFactor(-1)));
        }

        return legalMoves;
    }
}
