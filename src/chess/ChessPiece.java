package chess;

import boardgamer.Board;
import boardgamer.Piece;


public class ChessPiece extends Piece {
    
    private Color color; 

    public ChessPiece(Board board, Color color) { //Para definir a cor de de uma Peça do xadrez, a cor podeser acessada porem não pode ser alterada
        super(board);
        this.color = color;
    }

    public Color getColor() { //Somente o get sem o set, pois o jagodor e  o jogo não pode alterar a cor da peça.
        return color;
    }
 }
