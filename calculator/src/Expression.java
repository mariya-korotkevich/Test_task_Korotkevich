public class Expression {
    private String expression;
    private Number operand1, operand2;
    private Operation operation;
    private boolean isRoman;

    public Expression(String expression){

        this.expression = expression;

        String[] s = expression.split(" ");
        if (s.length != 3) {
            throw new RuntimeException();
        }

        boolean firstIsRoman = Roman.isRoman(s[0]);
        boolean secondIsRoman = Roman.isRoman(s[0]);

        if (firstIsRoman && secondIsRoman) {
            isRoman = true;
            operand1 = new Roman(s[0]);
            operand2 = new Roman(s[2]);
        }
        else if (!firstIsRoman && !secondIsRoman) {
            isRoman = false;
            operand1 = new Arabic(s[0]);
            operand2 = new Arabic(s[2]);
        }
        else{
            throw new RuntimeException();
        }

        operation = new Operation(s[1]);
    }

    public String calc(){

        int result = operation.calculate(operand1, operand2);
        return operand1.valueOf(result);
    }
}