
public class BankAccount implements Comparable<BankAccount>
{
	private String name;
	private double balance;

	public BankAccount(String aName, double aBalance)
	{
		name = aName;
		balance = aBalance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;	
	}
	
	public int compareTo(BankAccount that)
	{
		if (balance < that.balance) return -1;
		if (balance > that.balance) return 1;
		return 0;
	}
}
