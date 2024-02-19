import java.util.Objects;

public class Coordinates {
    private int x;
    private int y;
    public Coordinates(String chessNotation) {
        char file = chessNotation.charAt(0);
        int rank = Integer.parseInt(chessNotation.substring(1));
        this.x = fileToX(file);
        this.y = rankToY(rank);
    }
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    private int rankToY(int rank) {
        return 8 - rank;
    }
    private int fileToX(char file) {
        return file - 97;
    }
    public Coordinates getOffset(int xOffset, int yOffset) {
        return new Coordinates(x + xOffset, y + yOffset);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
