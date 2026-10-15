public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[5];

        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 5000);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 10000);
        salesStaff[4] = new Salesperson("Don", "Trump", 7000);

        Sorting.insertionSort(salesStaff);

        System.out.println("Sales Staff:");
        for (Salesperson salesperson : salesStaff) {
            System.out.println(salesperson);
        }
    }
}
