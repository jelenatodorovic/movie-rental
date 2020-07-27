import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    public String statement() {
        String result = "main.java.state.pattern.Rental records for " + name + "\n";
        Enumeration eRentals = rentals.elements();
        while (eRentals.hasMoreElements()) {
            Rental each = (Rental) eRentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getMovie().getCharge(each.getDaysRented()) + "\n";
        }

        result += "Amount owned is "+ getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRentalPoints() + " frequent rental points. \n";
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration eRentals = rentals.elements();
        while(eRentals.hasMoreElements()) {
            Rental aRental = (Rental) eRentals.nextElement();
            totalAmount += aRental.getMovie().getCharge(aRental.getDaysRented());
        }
        return totalAmount;
    }

    private int getTotalFrequentRentalPoints() {
        int totalFrequentRentalPoints = 0;
        Enumeration eRentals = rentals.elements();
        while(eRentals.hasMoreElements()) {
            Rental aRental = (Rental) eRentals.nextElement();
            totalFrequentRentalPoints += aRental.getMovie().getFrequentRentalPoints(aRental.getDaysRented());
        }
        return totalFrequentRentalPoints;
    }

}
