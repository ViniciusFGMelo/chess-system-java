package boardgame;

//Classe Boar não irá retornar a matriz inteira
//Apenaas uma peça por vez
public class Board {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    
    //Metodo para retornar uma peça dada a linha e coluna
    public Piece piece(int row, int column){
        return pieces[row][column];
    }
    
    //Metodo para retonar a peça pela posição
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
    
    public void placePiece( Piece piece, Position position){
        //Pegando a matriz piece, ja declarada nesta classe, na posição dada
        //e atribuindo a ela a peça informada
        pieces[position.getRow()][position.getColumn()] = piece;
        //atualizando a nova posição
        piece.position = position;
    }
}
    
    
    
    
