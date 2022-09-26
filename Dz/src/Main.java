import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Phonk phone = new Phonk("2281488", "xiaomi", 228);
        phone.receiveCall("vasya");
        phone.receiveCall("ktaya","2281488");

        String numbers[] = new String[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = String.valueOf(random.nextInt(10000000));


        }
        phone.sendMessage(numbers);
    }

}