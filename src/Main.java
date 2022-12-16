public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int milePrice = 20;
        int bonusMile = ticketPrice / milePrice;
        System.out.println("Стоимость вашего билета " + ticketPrice + " рублей, вам начислено " + bonusMile + " миль.");
    }
}