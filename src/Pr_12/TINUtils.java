package Pr_12;

public class TINUtils {
    public static void checkTIN(PurchaseOnline customer) throws TINNumberException {
        if(customer.getNumberTIN() < 100000000000L) {
            throw new TooShortTINNumberException("ИНН: " + customer.getNumberTIN()  + " too short");
        }
        else if(customer.getNumberTIN()  > 999999999999L) {
            throw new TooShortTINNumberException("ИНН: " + customer.getNumberTIN()  + " too long");
        }
        System.out.println("ИНН: " + customer.getNumberTIN()  + " accepted!");
    }
}
