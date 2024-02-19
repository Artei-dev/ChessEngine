import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest extends PieceTest {
    @Test
    void knightCanMoveNorthEast() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c1");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("d3");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
   }
    @Test
    void knightCanMoveNorthWest() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c1");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("b3");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void knightCanMoveEastNorth() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c1");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("e2");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void knightCanMoveEastSouth() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c3");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("e2");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void knightCanMoveWestNorth() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c3");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("a4");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void knightCanMoveWestSouth() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c3");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("a2");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void knightCanMoveSouthWest() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c3");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("b1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void knightCanMoveSouthEast() {
        Knight knight = new Knight(Color.WHITE);
        knight.setPosition("c3");
        List<Coordinates> legalMoves  = knight.getLegalMoves();
        Coordinates destinedPosition = new Coordinates("d1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
}