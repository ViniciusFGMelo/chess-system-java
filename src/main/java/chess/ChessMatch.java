package chess;

import boardgame.Board;

public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }
    
    //Metodo para retornar uma matriz de peças de xadrez correspondente a partida
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        //Percorrendo a matriz de peças do tabuleiro board
        //Para cada peça do tabuleiro, fazendo downcasting para chesspiece
        for(int i=0; i<board.getRows(); i++){
            for(int j=0; j<board.getColumns(); j++){
                //Downcasting para ser interpretado como uma peça de xadrez
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    
    
}
