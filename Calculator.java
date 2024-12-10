import java.util.Scanner;

public class Calculator {
    double a;
    double b;

    public double Addition(double x, double y){
        return x + y;
    }

    public double Subtraction(double x, double y){
        return x - y;
    }

    public double Multiplication(double x, double y){
        return x * y;
    }

    public double Division(double x, double y){
        return x / y;
    }

    //Building menu base program

    public void runCalculator(){
        System.out.println("Welcome User");
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Enter \n 1 -> Addition \n 2 -> Subtraction \n 3 -> Multiplication \n 4 -> Division");
            int user_Input = sc.nextInt();

            System.out.println("Enter 1st Number");
            a = sc.nextDouble();
            System.out.println("Enter 2nd Number");
            b = sc.nextDouble();

            switch (user_Input) {
                case 1 -> System.out.println(Addition(a, b));
                case 2 -> System.out.println(Subtraction(a, b));
                case 3 -> System.out.println(Multiplication(a, b));
                case 4 -> System.out.println(Division(a, b));
                default -> System.out.println("Enter Valid Option");
            }
            System.out.println("Press 0 to exit");
            input = sc.nextInt();
        }while(input!=0);
    }
}
