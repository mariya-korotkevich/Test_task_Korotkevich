import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String textLine = in.nextLine();
        in.close();

        Expression expression = new Expression(textLine);
        System.out.println(expression.calc());

    }
}