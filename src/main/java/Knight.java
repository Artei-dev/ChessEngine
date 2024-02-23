import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color);
    }

    @Override
    public List<Coordinates> getLegalMoves(Piece[][] chessBoard) {
        List<Coordinates> legalMoves = new ArrayList<>();
        // From white pieces perspective
        // North-East
        if (position.getX() < 7 && position.getY() > 1) {
            legalMoves.add(position.getWithOffset(1, 2));
        }
        // North-West
        if (position.getX() > 0 && position.getY() > 1 ) {
            legalMoves.add(position.getWithOffset(-1, 2));
        }
        // East-North
        if(position.getX() < 6 && position.getY() > 0) {
            legalMoves.add(position.getWithOffset(2, 1));
        }
        // East-South
        if(position.getX() < 6 && position.getY() <7) {
            legalMoves.add(position.getWithOffset(2, -1));
        }
        //West-North
        if(position.getX() > 1 && position.getY() > 0) {
            legalMoves.add(position.getWithOffset(-2, 1));
        }
        //West-South
        if(position.getX() > 1 && position.getY() < 7) {
            legalMoves.add(position.getWithOffset(-2, -1));
        }
        //South-East
        if(position.getX() < 7 && position.getY() < 6) {
            legalMoves.add(position.getWithOffset(1, -2));
        }
        //South-West
        if(position.getX() > 0 && position.getY() < 6) {
            legalMoves.add(position.getWithOffset(-1, -2));
        }
        return legalMoves;
    }
}
