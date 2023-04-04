import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = teclado.nextDouble();
        double area = 3.14159265359 * raio * raio;
        System.out.printf("A área do círculo é de: %.2f", area);
        teclado.close();
    }
}
