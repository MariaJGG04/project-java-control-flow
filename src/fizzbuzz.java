import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final: ");
        int fin = scanner.nextInt();

        if (inicio > fin) {
            System.out.println("El número inicial debe ser menor o igual al final.");
            return;
        }

        for (int i = inicio; i <= fin; i++) {
            boolean mult3 = (i % 3 == 0);
            boolean mult5 = (i % 5 == 0);
            boolean mult7 = (i % 7 == 0);

            if (mult3 && mult5 && mult7) {
                System.out.println("FizzBuzzBoom");
            } else if (mult3 && mult5) {
                System.out.println("FizzBuzz");
            } else if (mult3 && mult7) {
                System.out.println("FizzBoom");
            } else if (mult5 && mult7) {
                System.out.println("BuzzBoom");
            } else if (mult3) {
                System.out.println("Fizz");
            } else if (mult5) {
                System.out.println("Buzz");
            } else if (mult7) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
