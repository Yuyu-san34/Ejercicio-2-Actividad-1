import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el lado 'b': ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el lado 'c': ");
        double c = scanner.nextDouble();
        double perimetro = a + b + c;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        System.out.println("\nResultados:");
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Semiperímetro del triángulo: " + semiperimetro);
        System.out.println("Área del triángulo: " + area);
        scanner.close();
    }
}
