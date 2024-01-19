import java.util.Random;
public class git {
    public static void main(String[] args) {
 
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(6);

        System.out.println("La cara es: " + numeroAleatorio);
    }
}