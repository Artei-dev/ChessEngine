import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {
    @Test
    void canAddPawn() {
        ChessBoard chessBoard = new ChessBoard();
        Pawn pawn = new Pawn(Color.WHITE);
        chessBoard.addPiece("a1", pawn);

        assertEquals(pawn, chessBoard.getPiece("a1"));
    }
    @Test
    void canAddKnight() {
        ChessBoard chessBoard = new ChessBoard();
        Knight knight = new Knight(Color.WHITE);
        chessBoard.addPiece("a1", knight);

        assertEquals(knight, chessBoard.getPiece("a1"));
    }
    @Test
    void canMoveC1KnightToD3() {
        ChessBoard chessBoard = new ChessBoard();
        Knight knight = new Knight(Color.WHITE);
        chessBoard.addPiece("c1", knight);
        assertEquals(chessBoard.getPiece("c1"), knight);
        chessBoard.movePiece("c1", "d3");
        assertEquals(chessBoard.getPiece("d3"), knight);
        assertNull(chessBoard.getPiece("a1"));
    }
    @Test
    void canNotMoveKnightToInvalidSquare() {
        ChessBoard chessBoard = new ChessBoard();
        Knight knight = new Knight(Color.WHITE);
        chessBoard.addPiece("c1", knight);
        assertEquals(chessBoard.getPiece("c1"), knight);
        chessBoard.movePiece("c1", "d4");
        assertEquals(chessBoard.getPiece("c1"), knight);
        assertNull(chessBoard.getPiece("d4"));
    }

    @Test
    void canNotMoveKnightToFriendlyOccupiedSquare() {
        ChessBoard chessBoard = new ChessBoard();
        Knight knight = new Knight(Color.WHITE);
        Knight knight1 = new Knight(Color.WHITE);
        chessBoard.addPiece("c1", knight);
        chessBoard.addPiece("d3", knight1);
        assertEquals(chessBoard.getPiece("c1"), knight);
        assertEquals(chessBoard.getPiece("d3"), knight1);
        chessBoard.movePiece("c1", "d3");
        assertEquals(chessBoard.getPiece("c1"), knight);
        assertEquals(chessBoard.getPiece("d3"), knight1);
    }

    @Test
    void canMoveC1KnightToEnemyOccupiedSquare() {
        ChessBoard chessBoard = new ChessBoard();
        Piece knight = new Knight(Color.WHITE);
        Piece pawn = new Pawn(Color.BLACK);
        chessBoard.addPiece("c1", knight);
        chessBoard.addPiece("d3", pawn);

        assertEquals(chessBoard.getPiece("c1"), knight);
        assertEquals(chessBoard.getPiece("d3"), pawn);

        chessBoard.movePiece("c1", "d3");

        assertNull(chessBoard.getPiece("c1"));
        assertEquals(chessBoard.getPiece("d3"), knight);
        assertTrue(chessBoard.getWhiteCapturedPieces().contains(pawn));
    }

    @Test
    void canCaptureEnemyPieceByPawn() {
        ChessBoard chessBoard = new ChessBoard();
        Piece pawn = new Pawn(Color.WHITE);
        Piece knight = new Pawn(Color.BLACK);

        chessBoard.addPiece("a2", pawn);
        chessBoard.addPiece("b3", knight);
        assertEquals(chessBoard.getPiece("a2"), pawn);
        assertEquals(chessBoard.getPiece("b3"), knight);

        chessBoard.movePiece("a2", "b3");

        assertNull(chessBoard.getPiece("a2"));
        assertEquals(chessBoard.getPiece("b3"), pawn);
        assertTrue(chessBoard.getWhiteCapturedPieces().contains(knight));
    }

    @Test
    void canNotMovePawnDiagonallyIfItsNotAttacking() {
        ChessBoard chessBoard = new ChessBoard();
        Piece pawn = new Pawn(Color.WHITE);

        chessBoard.addPiece("a2", pawn);
        assertEquals(chessBoard.getPiece("a2"), pawn);

        chessBoard.movePiece("a2", "b3");
        assertEquals(chessBoard.getPiece("a2"), pawn);
        assertNull(chessBoard.getPiece("b3"));
    }

    @Test
    void RookCanNotJumpOverPieces() {
        ChessBoard chessBoard = new ChessBoard();
        Piece rook = new Rook(Color.WHITE);
        Piece pawn = new Pawn(Color.BLACK);

        chessBoard.addPiece("a1", rook);
        assertEquals(chessBoard.getPiece("a1"), rook);

        chessBoard.addPiece("a3", pawn);
        assertEquals(chessBoard.getPiece("a3"), pawn);

        chessBoard.movePiece("a1", "a4");

        assertEquals(chessBoard.getPiece("a1"), rook);
        assertEquals(chessBoard.getPiece("a3"), pawn);
        assertNull(chessBoard.getPiece("a4"));
    }
}