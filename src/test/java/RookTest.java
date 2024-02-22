import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RookTest extends PieceTest {
    @Test
    void rookCanMove7SquaresHorizontal() {
        Rook rook = new Rook(Color.WHITE);
        rook.setPosition("a1");
        List<Coordinates> legalMoves = rook.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("h1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void rookCanMove1SquaresHorizontal() {
        Rook rook = new Rook(Color.WHITE);
        rook.setPosition("a1");
        List<Coordinates> legalMoves = rook.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("b1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void rookCanMove4SquaresHorizontal() {
        Rook rook = new Rook(Color.WHITE);
        rook.setPosition("a1");
        List<Coordinates> legalMoves = rook.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("e1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void rookCanMove7SquaresVertical() {
        Rook rook = new Rook(Color.WHITE);
        rook.setPosition("a1");
        List<Coordinates> legalMoves = rook.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("a8");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }

    @Test
    void rookCanMove1SquaresVertical() {
        Rook rook = new Rook(Color.WHITE);
        rook.setPosition("a1");
        List<Coordinates> legalMoves = rook.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("a2");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void rookCanMove4SquaresVertical() {
        Rook rook = new Rook(Color.WHITE);
        rook.setPosition("a1");
        List<Coordinates> legalMoves = rook.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("a5");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
}