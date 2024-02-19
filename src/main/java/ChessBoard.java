public class ChessBoard {
    private Piece[][] board = new Piece[8][8];
    public void addPiece(String position, Piece piece) {
        Coordinates coords = new Coordinates(position);
        board[coords.getX()][coords.getY()] = piece;
    }

    public Piece getPiece(String position) {
        Coordinates coords = new Coordinates(position);
        return board[coords.getX()][coords.getY()];
    }
    public Piece deletePiece(String position) {
        Coordinates coords = new Coordinates(position);
        Piece piece = getPiece(position);
        board[coords.getX()][coords.getY()] = null;
        return piece;
    }

    public void movePiece(String position1, String position2) {
        Piece piece = deletePiece(position1);
        addPiece(position2, piece);
    }
}
