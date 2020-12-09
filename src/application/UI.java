
package application;

import chess.ChessPiece;


public class UI {
    //Classe para impimir  
    public static void printBoard(ChessPiece[][] pieces){ // Impressão do tabuleiro
        for(int i=0; i<pieces.length; i++){
            System.out.print((8-i) + " ");
            for(int j=0; j < pieces.length; j++){
            printPiece(pieces[i][j]);
                
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
        
    }
    
    private static void printPiece(ChessPiece piece){ // Impimir uma única peça, caso a não tenha peça no local irá iumprimir um local vazio "-".
        if(piece == null){
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
  
    
}
