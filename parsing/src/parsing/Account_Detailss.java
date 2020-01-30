package parsing;

public class Account_Detailss 
{
      int Account_Number;
      double Account_Balance;
	public Account_Detailss()
	{
	System.out.println("Here are the Account Details of XYZ Bank");
	}
	public void display_Current_Account_Balance()
	{
		System.out.println("Current Balance : " + " " +" Rs. "+ Account_Balance);
	}
    public void Withdraw(int amount)
  {
	if (amount>Account_Balance)
	{
				System.out.println("Less Balance");
		return;
	}
	else
	{
		System.out.println(amount +"  Rs. Withdrawn");
	}
  }
}
