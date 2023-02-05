package abstraction_basic;

public class Main {

    public static void main(String[] args) {

        MobileUser mu;//Reference Variable

        mu = new Shourav();
        mu.call();
        mu.sendMessage();

        mu = new Salman();
        mu.sendMessage();
    }

}
