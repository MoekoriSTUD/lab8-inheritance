package tickets;

public class Main {
    public static void main(String[] args) {
        double basePrice = 80;

        Ticket standardTicket = new Ticket("Summer Concert", "Alice", basePrice);
        StudentTicket studentTicket = new StudentTicket("Summer Concert", "Bob", basePrice, "123WWW");
        VIPTicket vipTicket = new VIPTicket("Summer Concert", "Charlie", basePrice);
        EarlyBirdTicket earlyBirdTicket1 = new EarlyBirdTicket("Summer Concert", "John", 50);
        EarlyBirdTicket earlyBirdTicket2 = new EarlyBirdTicket("Summer Concert", "Dean", 7);

        System.out.println(standardTicket.getEventName());
        System.out.println("Standard Ticket - " + standardTicket.getHolderName() + ":\t" + "€" + standardTicket.calculatePrice());
        System.out.println("Student Ticket - " + studentTicket.getHolderName() + ":\t" + "€" +studentTicket.calculatePrice());
        System.out.println("VIP Ticket - " + vipTicket.getHolderName() + ":\t" + "€" +vipTicket.calculatePrice());
        System.out.println("Student ID: " + studentTicket.getStudentId());
        System.out.println("Benefits: " + vipTicket.getBenefits());

        System.out.println("");
        System.out.println("Early Bird Ticket with base price €50: " + earlyBirdTicket1.calculatePrice());
        System.out.println("Early Bird Ticket with base price €7: " + earlyBirdTicket2.calculatePrice());
    }
}
