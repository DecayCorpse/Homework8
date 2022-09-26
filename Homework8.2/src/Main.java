import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Pacient vaccya = new Pacient(random.nextInt(3));
vaccya.pohilitsya();
    }
}