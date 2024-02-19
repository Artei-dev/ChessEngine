import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece{
    public Knight(Color color) {
        super(color);
    }
    @Override
    public List<Coordinates> getLegalMoves() {
        List<Coordinates> legalMoves = new ArrayList<>();
        return legalMoves;
    }
}
