
package boardgame;

public class Piece {

   
    protected Board getBoard() {
        return board;
    }
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    
    
}
