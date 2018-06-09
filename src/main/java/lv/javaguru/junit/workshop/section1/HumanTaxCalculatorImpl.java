package lv.javaguru.junit.workshop.section1;

public class HumanTaxCalculatorImpl implements HumanTaxCalculator {

    private TaxRateDB taxRateDB;
    private EmailSender emailSender;

    public HumanTaxCalculatorImpl(TaxRateDB taxRateDB,
                                  EmailSender emailSender) {
        this.taxRateDB = taxRateDB;
        this.emailSender = emailSender;
    }

    @Override
    public double calculateTax(double income, int year) {
        TaxRate taxRate = taxRateDB.getTaxRate(year);
        if (income < 20000.0) {
            return income * taxRate.getTax1();
        } else {
            IncomeInfo incomeInfo = new IncomeInfo(year, income);
            emailSender.sendEmail(incomeInfo);
            return 20000.0 * taxRate.getTax1()
                    + (income - 20000.0) * taxRate.getTax2();
        }
    }

}
