import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PawnTest extends PieceTest {

    static Piece[][] chessBoard;
    @BeforeAll
    static void setup() {
        chessBoard = new ChessBoard().getBoard();
    }
    @Test
    void canMoveOneSquareForward() {
        Pawn pawn = new Pawn(Color.WHITE);
        pawn.setPosition("a1");
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a2");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }

    @Test
    void canMoveTwoSquaresForwardOnFirstMove() {
        Pawn pawn = new Pawn(Color.WHITE);
        pawn.setPosition("a1");
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a3");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }

    @Test
    void canNotMoveTwoSquaresForwardAfterFirstMove() {
        Pawn pawn = new Pawn(Color.WHITE);
        pawn.setPosition("a1");
        pawn.setHasMoved(true);
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a3");

        assertFalse(isMoveLegal(legalMoves, destinedPosition));
    }


    @Test
    void canNotMoveOneDiagonallyRight() {
        Pawn pawn = new Pawn(Color.WHITE);
        pawn.setPosition("h1");
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates(8, 6);

        assertFalse(isMoveLegal(legalMoves, destinedPosition));
    }
    @Test
    void canNotMoveOneDiagonallyLeft() {
        Pawn pawn = new Pawn(Color.WHITE);
        pawn.setPosition("a1");
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates(-1, 6);

        assertFalse(isMoveLegal(legalMoves, destinedPosition));
    }

    @Test
    void BlackPawnCanMoveOneSquareForward() {
        Pawn pawn = new Pawn(Color.BLACK);
        pawn.setPosition("a8");
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a7");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }

    @Test
    void BlackPawnCanMoveTwoSquaresForwardOnFirstMove() {
        Pawn pawn = new Pawn(Color.BLACK);
        pawn.setPosition("a8");
        List<Coordinates> legalMoves = pawn.getLegalMoves(chessBoard);
        Coordinates destinedPosition = new Coordinates("a6");

        assertTrue(isMoveLegal(legalMoves, destinedPosition));
    }
}
