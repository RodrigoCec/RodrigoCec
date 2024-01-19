import java.util.Random;
public class git {
    public static void main(String[] args) {
 
        Random random = new Random();
        Random random2 = new Random();
        
        int dado2 = random2.nextInt(6);
        int numeroAleatorio = random.nextInt(6);
        
        
        System.out.println("La cara del primer dado es: " + numeroAleatorio);
        System.out.println("La cara del segundo dado es: " + dado2);
    }
}