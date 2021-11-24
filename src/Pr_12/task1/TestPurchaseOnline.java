package Pr_12.task1;

public class TestPurchaseOnline {
    public static void main(String[] args) {
        PurchaseOnline customer = new PurchaseOnline("Henry", 12345);
        try {
            TINUtils.checkTIN(customer);
        }
        catch (TINNumberException e) {
            System.out.println("You have entered wrong ИНН number.");
            System.out.println(e.getMessage());
        }
    }
}