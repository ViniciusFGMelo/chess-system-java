package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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
    
    //Metodo responsável por iniciar a partida de xadrez
    //colocando as peças no tabuleiro
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
    
}
