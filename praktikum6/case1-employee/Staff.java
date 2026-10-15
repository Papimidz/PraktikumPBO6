public class Staff {
    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];

        staffList[0] = new Volunteer(
            "Andi", "Bandung", "0811111111"
        );

        staffList[1] = new Employee(
            "Budi", "Cimahi", "0822222222",
            "EMP001", 1500000
        );

        Executive executive = new Executive(
            "Citra", "Bandung", "0833333333",
            "EMP002", 2500000
        );
        executive.awardBonus(500000);
        staffList[2] = executive;

        Hourly hourly1 = new Hourly(
            "Deni", "Garut", "0844444444",
            "EMP003", 25000
        );
        hourly1.addHours(40);
        staffList[3] = hourly1;

        Hourly hourly2 = new Hourly(
            "Eka", "Sumedang", "0855555555",
            "EMP004", 30000
        );
        hourly2.addHours(35);
        staffList[4] = hourly2;

        staffList[5] = new Volunteer(
            "Fani", "Bandung", "0866666666"
        );

        Commission commission1 = new Commission(
            "Gilang", "Jakarta", "0877777777",
            "EMP005", 6.25, 0.20
        );
        commission1.addHours(35);
        commission1.addSales(400);
        staffList[6] = commission1;

        Commission commission2 = new Commission(
            "Hana", "Bekasi", "0888888888",
            "EMP006", 9.75, 0.15
        );
        commission2.addHours(40);
        commission2.addSales(950);
        staffList[7] = commission2;
    }

    public void payday() {
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            double amount = staffList[count].pay();
            System.out.println("Payment: Rp" + amount);
            System.out.println("--------------------");
        }
    }
}
