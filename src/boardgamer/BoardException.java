package boardgamer;

public class BoardException extends RuntimeException {
    private static final long serialversionUID = 1l;
    
    public BoardException(String msg){
        super(msg);
    }
}
