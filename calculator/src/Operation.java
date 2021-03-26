public class Operation {
    private String arithmeticOperation;

    public Operation(String arithmeticOperation) {
        if (!("+".equals(arithmeticOperation)||"-".equals(arithmeticOperation)||"*".equals(arithmeticOperation)||"/".equals(arithmeticOperation))) {
            throw new RuntimeException();
        }
        this.arithmeticOperation = arithmeticOperation;
    }

    public int calculate(Number operand1, Number operand2){

        int a = operand1.getValue();
        int b = operand2.getValue();

        if ("+".equals(arithmeticOperation)) {
            return a + b;
        } else if ("-".equals(arithmeticOperation)) {
            return a - b;
        } else if ("*".equals(arithmeticOperation)) {
            return a * b;
        } else {
            return a / b;
        }
    }
}
