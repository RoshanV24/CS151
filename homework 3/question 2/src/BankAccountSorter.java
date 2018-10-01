import java.util.ArrayList;
import java.util.Collections;

public class BankAccountSorter 
{
	public static void main(String[] args)
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount("Tim",100));
		accounts.add(new BankAccount("Bob",12345));
		accounts.add(new BankAccount("Mike",1000000));
		accounts.add(new BankAccount("Rob",100));
		accounts.add(new BankAccount("Phil",2000));
		accounts.add(new BankAccount("Keeth",1));
		
		Collections.sort(accounts);
		for (BankAccount b : accounts)
			System.out.println(b.getName() + " " + b.getBalance());
	}
}
