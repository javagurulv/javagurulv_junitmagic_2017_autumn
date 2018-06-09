package lv.javaguru.junit.workshop.section1;

public class TaxRate {

    private int year;
    private double tax1;
    private double tax2;

    public TaxRate(int year, double tax1, double tax2) {
        this.year = year;
        this.tax1 = tax1;
        this.tax2 = tax2;
    }

    public int getYear() {
        return year;
    }

    public double getTax1() {
        return tax1;
    }

    public double getTax2() {
        return tax2;
    }
}
