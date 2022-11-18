package boardgame;

public class Piece {
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

}
