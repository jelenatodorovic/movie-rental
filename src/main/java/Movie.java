public class Movie {
    public static final int NEW_RELEASE = 2;
    public static final int REGULAR = 0;
    public static final int CHILDREN = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {

        switch (priceCode) {
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect price code");
        }
    }

    public double getCharge(int daysRented) {
       return price.getCharge(daysRented);
    }

    public int getFrequentRentalPoints(int daysRented) {
        return price.getFrequentRentalPoints(daysRented);
    }
}
