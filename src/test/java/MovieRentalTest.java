import static junit.framework.TestCase.assertEquals;

public class MovieRentalTest {

    @org.junit.Test
    public void getCharge() {
        Movie movie = new Movie("Killing Eve", Movie.NEW_RELEASE);
        Movie movie1 = new Movie("Breakfast at Tiffany's", Movie.REGULAR);
        Movie movie2 = new Movie("Cars", Movie.CHILDREN);
        double charge = movie.getCharge(3);
        double charge1 = movie1.getCharge(3);
        double charge2 = movie2.getCharge(3);
        assertEquals("New release charge", 9.0, charge);
        assertEquals("Regular charge", 3.5, charge1);
        assertEquals("Children charge", 1.5, charge2);

    }

    @org.junit.Test
    public void getFrequentRentalPoints() {
        Movie movie = new Movie("Killing Eve", Movie.NEW_RELEASE);
        Movie movie1 = new Movie("Breakfast at Tiffany's", Movie.REGULAR);
        Movie movie2 = new Movie("Cars", Movie.CHILDREN);
        int frequentRentalPoints = movie.getFrequentRentalPoints(2);
        int frequentRentalPoints1 = movie1.getFrequentRentalPoints(2);
        int frequentRentalPoints2 = movie1.getFrequentRentalPoints(2);
        assertEquals(2, frequentRentalPoints);
        assertEquals(1, frequentRentalPoints1);
        assertEquals(1, frequentRentalPoints2);
    }
}