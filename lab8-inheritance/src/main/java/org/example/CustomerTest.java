package org.example;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Paul", "123456", "Gort", 123, true);
        System.out.println(firstCustomer);

        Customer secondCustomer = new Customer();
        secondCustomer.setName("Bob");
        secondCustomer.setPhoneNumber("123456789");
        secondCustomer.setAddress("Bob Street");
        secondCustomer.setCustomerNumber(123);
        secondCustomer.setMailingList(false);
        System.out.println("");
        System.out.println(secondCustomer);
    }
}
