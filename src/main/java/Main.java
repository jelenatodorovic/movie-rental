public class Main {

    public static void main(String[] args) {

        Movie harryPotter = new Movie("Harry Potter", Movie.REGULAR);
        Movie cars = new Movie("Cars", Movie.CHILDREN);
        Movie kilingEve = new Movie("Killing Eve", Movie.NEW_RELEASE);

        Customer cus1 = new Customer("Nina");

        Rental rental1 = new Rental(kilingEve, 3);

        cus1.addRental(rental1);

        System.out.println(cus1.statement());
    }
}
