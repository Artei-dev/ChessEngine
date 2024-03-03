import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public List<Coordinates> getLegalMoves(Piece[][] chessBoard) {
        List<Coordinates> legalMoves = new ArrayList<>();
        Coordinates currentPos = position;

        // preprocessing
        // checks distance from nearest edge of the board for the x, y coordinates
        int xwidth = currentPos.getX() > 4 ?  8 - currentPos.getX() : currentPos.getX();
        int ywidth = currentPos.getY() > 4 ?  8 - currentPos.getY() : currentPos.getY();

        int smallestWidth = Math.min(xwidth, ywidth);

        // North - West
        for (int i = smallestWidth; i >= 0; i--) {

        }

        // North - East
        for (int i = smallestWidth; i < 8; i--) {

        }

        // South - West
        for (int i = smallestWidth; i >= 0; i--) {

        }

        // South - East
        for (int i = smallestWidth; i >= 0; i--) {

        }
        return legalMoves;
    }
}
