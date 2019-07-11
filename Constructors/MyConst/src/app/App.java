package app;

public class App {
    public static void main(String[] args) throws Exception {
        
  //  Account bobsAccount = new Account();
    //("12345", 0.00, "Bob", "Bob@gmail.com", "123-456-7890");

   // System.out.println(bobsAccount.getNumber());
   // System.out.println(bobsAccount.getBalance());

  //  bobsAccount.withdrawal(100.0);

   // bobsAccount.deposit(50.0);
   // bobsAccount.withdrawal(100.0);

  //  bobsAccount.deposit(51.0);
  //  bobsAccount.withdrawal(100.0);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}