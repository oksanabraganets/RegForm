public class MobleOperatorException extends Exception {
    String operator;

    public MobleOperatorException(String message, String operator) {
        super(message);
        this.operator = operator;
    }
    public String getOperator(){
        return operator;
    }
}
