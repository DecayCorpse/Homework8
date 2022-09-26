public class Phonk {
    private String number;
    private String model;
    private int weight;


    public Phonk(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;


    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phonk(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phonk() {
    }

    public void receiveCall(String name) {
        System.out.println(" звонит " + name);

    }

    public void receiveCall(String name, String number) {
        System.out.println(" звонит " + number + " " + name);

    }
    public void sendMessage(String numbers[]){
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("+ 375 29 " + numbers[i]);
        }
    }
}
