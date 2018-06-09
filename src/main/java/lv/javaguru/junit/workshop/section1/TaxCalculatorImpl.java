package lv.javaguru.junit.workshop.section1;

public class TaxCalculatorImpl implements TaxCalculator {

    private TaxBarrierProvider taxBarrierProvider;
    private EmailSender emailSender;

    public TaxCalculatorImpl(TaxBarrierProvider taxBarrierProvider,
                             EmailSender emailSender) {
        this.taxBarrierProvider = taxBarrierProvider;
        this.emailSender = emailSender;
    }

    @Override
    public double calculateTax(int year, double income) {
        double taxBarrier = taxBarrierProvider.getBarrier(year);
        if ((0 < income) && income <= taxBarrier) {
            return income * 0.25;
        } else if (income > taxBarrier) {
            emailSender.sendEmail(year, income);
            return taxBarrier * 0.25
                    + (income - taxBarrier) * 0.40;
        }

        return 0.0;
    }

}
