package exceptiond;

public class ArgsException extends Exception{
    public ArgsException(String errorMessage) {
        super(errorMessage);
    }

    public String errorMessage() {
        return this.getMessage();
    }
}
