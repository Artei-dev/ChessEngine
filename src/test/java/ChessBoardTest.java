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
        chessBoard.addPiece("a1", knight);
        assertEquals(chessBoard.getPiece("a1"), knight);
        chessBoard.movePiece("a1", "d3");
        assertNull(chessBoard.getPiece("a1"));
        assertEquals(chessBoard.getPiece("d3"), knight);
    }
}