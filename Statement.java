import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = valueRentalRecordName(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += valueEachMovieTitle(each);
        }
        //add footer lines
        result += valueFooter(aCustomer);
        return result;
    }
    protected abstract String valueRentalRecordName(Customer aCustomer);
    protected abstract String valueEachMovieTitle(Rental each);
    protected abstract String valueFooter(Customer aCustomer);
}