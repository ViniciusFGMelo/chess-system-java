package boardgame;

public abstract class Piece {

    //Criando uma posição protected, pois não é a posição do xadrez
    //É uma posição simples de matriz
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Somente classes dentro do mesmo pacote e subclasses que vao poder acessar
    //o tabuleiro de uma peça
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isthereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
            
        }
        return false;
    }
            
}
