public class ChessBoard {
    private Piece[][] board = new Piece[8][8];
    public void addFigure(String square, Piece piece) {
        Coordinates coords = new Coordinates(square);
        board[coords.getX()][coords.getY()] = piece;
    }

    public Piece getPiece(String square) {
        Coordinates coords = new Coordinates(square);
        return board[coords.getX()][coords.getY()];
    }
}
