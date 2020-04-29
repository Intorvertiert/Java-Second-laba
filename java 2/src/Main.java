import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int choice = 100, option;
        Scanner scanner = new Scanner(System.in);
        do {
            try {


                System.out.println(ANSI_YELLOW +
                        "-------------------------" + "\n" +
                        "| 0 - Выход               |" + "\n" +
                        "-------------------------" + "\n" + ANSI_PURPLE +
                        "| 1 -Производная          |" + "\n" +
                        "-------------------------" + "\n");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println("Выход");
                        System.exit(0);
                        break;
                    }
                    case 1: {
                        /*Производная берется от t, так, как х отсутствует в уравнении */
                        System.out.println("Выберите функцию 1 или 2 ");
                        int choose = scanner.nextInt();
                        System.out.println("Введите значение");
                        double par1 = scanner.nextInt();

                        switch (choose) {
                            case 1: {
                                final Function expression = new SomeFunction1(new FirstFunction(-0.5), new ConstFunction(1.7));
                                System.out.println(ANSI_WHITE + "f(" + par1 + ") = " + expression.calculate(par1));
                                System.out.println(ANSI_WHITE + "f'(" + par1 + ") = " + expression.derivative(par1));
                                break;
                            }
                            case 2 :{
                                final Function expression = new SomeFunction2(new SecondFunction(-0.5), new ConstFunction(1.7));
                                System.out.println(ANSI_WHITE + "f(" + par1 + ") = " + expression.calculate(par1));
                                System.out.println(ANSI_WHITE + "f'(" + par1 + ") = " + expression.derivative(par1));
                                break;
                            }
                        }
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Промах");
                scanner.nextLine();
            }
        } while (choice != 0);
    }
}

