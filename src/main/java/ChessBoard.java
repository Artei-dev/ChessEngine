import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private Piece[][] board = new Piece[8][8];
    private List<Piece> whiteCapturedPieces = new ArrayList<>();
    private List<Piece> blackCapturedPieces = new ArrayList<>();
    public void addPiece(String position, Piece piece) {
        Coordinates coords = new Coordinates(position);
        piece.setPosition(position);
        board[coords.getX()][coords.getY()] = piece;
    }
    public Piece getPiece(String position) {
        Coordinates coords = new Coordinates(position);
        return board[coords.getX()][coords.getY()];
    }

    public void deletePiece(String position) {
        Coordinates coords = new Coordinates(position);
        board[coords.getX()][coords.getY()] = null;
    }
    private void capturePiece(String position) {
        Piece piece = getPiece(position);
        if(piece != null) {
            switch (piece.color) {
                case Color.BLACK -> whiteCapturedPieces.add(piece);
                case Color.WHITE -> blackCapturedPieces.add(piece);
            }
        }
    }
    public void movePiece(String position1, String position2) {
        Piece piece1 = getPiece(position1);
        Piece piece2 = getPiece(position2);

        boolean sameColor = piece2 != null && piece2.color == piece1.color;
        if(piece1.getLegalMoves(board).contains(new Coordinates(position2)) && !sameColor) {
            deletePiece(position1);
            capturePiece(position2);
            addPiece(position2, piece1);
        }
    }

    public List<Piece> getWhiteCapturedPieces() {
        return whiteCapturedPieces;
    }

    public List<Piece> getBlackCapturedPieces() {
        return blackCapturedPieces;
    }

    public Piece[][] getBoard() {
        return board;
    }
}
