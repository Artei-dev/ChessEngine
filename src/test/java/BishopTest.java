import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest extends PieceTest {
    static Piece[][] chessBoard;
    @BeforeAll
    static void setup() {
        chessBoard = new ChessBoard().getBoard();
    }

    @Test
    void canMoveNorthWestFullDistance() {
        Bishop bishop = new Bishop(Color.WHITE);
        bishop.setPosition("d1");
        List<Coordinates> legalMoves = bishop.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("h5");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void canMoveNorthEastFullDistance() {
        Bishop bishop = new Bishop(Color.WHITE);
        bishop.setPosition("d1");
        List<Coordinates> legalMoves = bishop.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a4");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void canMoveSouthWestFullDistance() {
        Bishop bishop = new Bishop(Color.WHITE);
        bishop.setPosition("d5");
        List<Coordinates> legalMoves = bishop.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("h1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void canMoveSouthEastFullDistance() {
        Bishop bishop = new Bishop(Color.WHITE);
        bishop.setPosition("d4");
        List<Coordinates> legalMoves = bishop.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a1");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }

}