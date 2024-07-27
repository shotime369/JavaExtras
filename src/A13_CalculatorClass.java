public class A13_CalculatorClass {

    private final double operand1;
    private final double operand2;
    private final String operator;

    //constructor
    public A13_CalculatorClass(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;

    }

    //method
    private double operate(){
         if (this.operator.equals("+")) {
             return operand1+operand2;
         }
         else if (this.operator.equals("-")) {
             return operand1-operand2;
         }
         else if (this.operator.equals("*")) {
             return operand1*operand2;
         }
         else if (this.operator.equals("/")) {
             return operand1/operand2;
         }
         else{
        return operand1+operand2;
    }
    }

    public static void main(String[] args) {
        System.out.println("duck = " + new A13_CalculatorClass(2,6,"*").operate());

    }
}
