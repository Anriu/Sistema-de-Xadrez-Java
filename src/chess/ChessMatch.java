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
   
    
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void initialSetup(){ //Coloca as peças no tabuleiro na posição inicial.
        placeNewPiece('a', 8, new Rook(board, Color.WHITE));
        placeNewPiece('h', 8, new Rook(board, Color.WHITE));
   } 
    
}
