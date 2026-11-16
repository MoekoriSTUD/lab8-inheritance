package tickets;

public class EarlyBirdTicket extends Ticket {
    public EarlyBirdTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice() {
        if (getBasePrice() - 10 < 0) {
            return 0;
        }
        return getBasePrice() - 10;
    }
}
