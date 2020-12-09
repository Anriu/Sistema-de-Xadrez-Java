package boardgamer;


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
    
    public Piece piece(int row, int column){  //Retorna a matrix peice do tipo Piece em nas posições row e column
        return pieces[row][column];
        
    }
    
    public Piece piece(Position position){ //Retorna a peça pela posição position do tipo Position
        return pieces[position.getRow()][position.getColum()];
    }
}
