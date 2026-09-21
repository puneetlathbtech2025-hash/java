class BankAccount {


final int accountNumber = 123456;


String name = "Puneet"; double balance = 50000;

void display() {
System.out.println("Bank Account Details");
System.out.println("Account Number: " + accountNumber); System.out.println("Name: " + name);
System.out.println("Balance: ₹" + balance);
}
}


public class BankAccountDemo {
public static void main(String[] args) {


BankAccount account = new BankAccount();


account.display();
}
}
