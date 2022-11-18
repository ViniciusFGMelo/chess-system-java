package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i=0; i < pieces.length; i++) {
            //imprimindo o numero da linha na lateral
            System.out.print((8 - i) + " ");
            //colocando pieces.length por a matriz ser quadrada
            for(int j=0; j<pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            //quebra de linha para dar espaço de uma linha para a outra
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    //Metodo para imprimir uma unica peça
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        //espaço em branco para as peças nao ficarem grudadas
        System.out.print(" ");
    }
}
