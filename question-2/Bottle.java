public class Bottle {
  private double capacity;
    private double amount;
  
    public Bottle(double capacity) {
        this.capacity = capacity;
        this.amount = capacity;
    }
    public double updateAmount(double removedAmount) {
        amount -= removedAmount;
        if (amount < capacity * 0.25) {
            amount = capacity;
        } 
        return amount;
    }
}
