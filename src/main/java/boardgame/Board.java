package boardgame;

//Classe Boar não irá retornar a matriz inteira
//Apenaas uma peça por vez
public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //Metodo para retornar uma peça dada a linha e coluna
    public Piece piece(int row, int column) {
        if (!positionExists(rows, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    //Metodo para retonar a peça pela posição
    public Piece piece(Position position) {
                if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " + position);
        }
        //Pegando a matriz piece, ja declarada nesta classe, na posição dada
        //e atribuindo a ela a peça informada
        pieces[position.getRow()][position.getColumn()] = piece;
        //atualizando a nova posição
        piece.position = position;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if(thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " + position);
        }
        return piece(position) != null;
    }
}
