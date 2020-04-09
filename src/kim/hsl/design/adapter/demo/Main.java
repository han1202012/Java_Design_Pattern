package kim.hsl.design.adapter.demo;

public class Main {
    public static void main(String[] args) {
        PhoneCharge phoneCharge = new Adapter();
        phoneCharge.power5V();
    }
}
