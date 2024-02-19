import java.util.List;

public abstract class Piece {
    Color color;
    Coordinates position;
    boolean hasMoved = false;

    public Piece(Color color) {
        this.color = color;
    }
    public void setPosition(String positionChessNotation) {
        this.position = new Coordinates(positionChessNotation);
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public boolean getHasMoved() {
        return this.hasMoved;
    }

    public abstract List<Coordinates> getLegalMoves();
}
