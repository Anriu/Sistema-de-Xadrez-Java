package chess;

import boardgamer.Board;
import boardgamer.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    //classe para a partida do xadrez, o coração do jogo onde tera as regras logiccas do jogo.
    
    private Board board;
    
    public ChessMatch(){
        board = new Board(8, 8); //tamanho do tabuleiro.
        initialSetup();
    }
    
    
    public ChessPiece[][] getPieces(){ // Metodo que retorna a matrix de peças de xadrez, correspondente a paritda.
        
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i ++){
            for(int j = 0; j< board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j); //Downcasting de piece para ChessPiece.
            }
        }
        return mat;
    }
    
   private void initialSetup(){ //Coloca as peças no tabuleiro na posição inicial.
     board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
     board.placePiece(new King(board, Color.BLACk), new Position(0, 4));
     board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

   } 
    
}
