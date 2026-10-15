
public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String ssn, double payRate) {
        super(name, address, phone, ssn, payRate);
        bonus = 0.0;
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0.0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPosition: Executive";
    }
}
