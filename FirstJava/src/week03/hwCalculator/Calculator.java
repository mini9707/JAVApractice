package week03.hwCalculator;

public class Calculator {
    private AbstractOperation operation;
    public Calculator (AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }
    public double calculator(int firstNumber, int secondNumber){
        double answer = 0;

        answer = operation.operate(firstNumber,secondNumber);

//        if (operator.equals("+")) {
//            answer = addOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("-")) {
//            answer = substractOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("*")) {
//            answer = multiplyOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("/")) {
//            answer = divideOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("%")) {
//            answer = firstNumber % secondNumber;
//        }

        return answer;
    }
}
