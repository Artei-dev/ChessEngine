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
    public List<Coordinates> getLegalMoves(Piece[][] chessBoard) {
        List<Coordinates> legalMoves = new ArrayList<>();
        // one square forward
        legalMoves.add(position.getWithOffset(0, directionFactor(1)));
        // two squares forward
        if(!getHasMoved()) {
            legalMoves.add(position.getWithOffset(0, directionFactor(2)));
        }

        if(position.getX() != 0 && chessBoard[position.getX() - 1][position.getY() - directionFactor(1)] != null) {
            legalMoves.add(position.getWithOffset(-1, directionFactor(1)));
        }

        if(position.getX() != 7 && chessBoard[position.getX() + 1][position.getY() - directionFactor(1)] != null) {
            legalMoves.add(position.getWithOffset(1, directionFactor(1)));
        }

        return legalMoves;
    }
}
