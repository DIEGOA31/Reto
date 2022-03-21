import java.util.Random;

public class Auxiliar {
    Random random = new Random();
    public int numeroAleatorio(){
        return random.nextInt((5 - 1) + 1) + 1;
    }
}
