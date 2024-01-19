import java.util.Random;
import java.util.Scanner;

public class git {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantos dados deseas usar: ");
         int cantidadDados = scanner.nextInt();
 
        Random random = new Random();

        System.out.println("Resultados de los dados:");

        for (int i = 0; i < cantidadDados; i++) {
            int resultadoDado = random.nextInt(6) + 1;
            System.out.println("Dado " + (i + 1) + ": " + resultadoDado);
        }

        scanner.close();
    }
}