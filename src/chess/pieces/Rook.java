package chess.pieces;

import boardgamer.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    //Classe da torre, que é uma peça.
    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
