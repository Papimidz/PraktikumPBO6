public class Salesperson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public int compareTo(Object other) {
        Salesperson otherSales = (Salesperson) other;

        if (this.totalSales != otherSales.totalSales) {
            return this.totalSales - otherSales.totalSales;
        }

        String thisName = this.lastName + this.firstName;
        String otherName = otherSales.lastName + otherSales.firstName;

        return thisName.compareTo(otherName);
    }

    public String toString() {
        return firstName + " " + lastName + ": " + totalSales;
    }
}
