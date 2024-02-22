import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color);
    }

    @Override
    public List<Coordinates> getLegalMoves() {
        List<Coordinates> legalMoves = new ArrayList<>();
        Coordinates currentPos = position;

        // horizontal left
        for(int i = currentPos.getX(); i >= 0; i--) {
            Coordinates square = new Coordinates(i, currentPos.getY());
            legalMoves.add(square);
        }
        // horizontal right
        for(int i = currentPos.getX(); i < 8; i++) {
            Coordinates square = new Coordinates(i, currentPos.getY());
            legalMoves.add(square);
        }

        // vertical up
        for(int i = currentPos.getY(); i >= 0; i--) {
            Coordinates square = new Coordinates(currentPos.getX(), i);
            legalMoves.add(square);
        }
        // vertical down
        for(int i = currentPos.getY(); i < 8; i++) {
            Coordinates square = new Coordinates(currentPos.getX(), i);
            legalMoves.add(square);
        }

        return legalMoves;
    }

    @Override
    public void setPosition(String positionChessNotation) {
        super.setPosition(positionChessNotation);
    }
}
