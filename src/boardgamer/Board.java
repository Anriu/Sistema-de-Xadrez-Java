package boardgamer;


public class Board {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Error creanting board: there must be at least row and 1 column");
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

    public Piece piece(int row, int column){  //Retorna a matrix peice do tipo Piece em nas posições row e column
        if (!positionExists(row, column)){
            throw new BoardException("Pisition not on the board");
        }
        return pieces[row][column];
        
    }
    
    public Piece piece(Position position){ //Retorna a peça pela posição position do tipo Position
        if (!positionExists(position)){
            throw new BoardException("Pisition not on the board");
        } 
        return pieces[position.getRow()][position.getColum()];
    }
    
    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("The is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColum()] = piece;
        piece.position = position;
    }
    
    private boolean positionExists(int row, int column){ // Testa se uma dada posião existe em uma linha e coluna 
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColum());
    }
    
    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Pisition not on the board");
        }
        return piece(position)!= null;
    }
    
}

