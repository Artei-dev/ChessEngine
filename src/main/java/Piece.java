import java.util.List;

public abstract class Piece {
    protected Color color;
    protected Coordinates position;
    private boolean hasMoved = false;
    private boolean isAttacking = false;

    public Piece(Color color) {
        this.color = color;
    }
    public void setPosition(String positionChessNotation) {
        this.position = new Coordinates(positionChessNotation);
    }
    public abstract List<Coordinates> getLegalMoves(Piece[][] chessBoard);
    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public boolean getHasMoved() {
        return this.hasMoved;
    }

    public void setIsAtacking(boolean atacking) {
        isAttacking = atacking;
    }
    public boolean getIsAtacking() {
        return isAttacking;
    }

    public Coordinates getPosition() {
        return position;
    }

    public void setPosition(Coordinates position) {
        this.position = position;
    }
}
