package ps3;
import java.util.Date;;


public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
		Date date = new Date();
		this.dateCreated= date;
		
		
	}
	public Account(int id, double balance){
		this();
		this.id=id;
		this.balance=balance;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;	
	}
	
	public double withdraw(double amountWithdraw) throws InsufficientFundsException {
		
		if (balance>amountWithdraw) {
			this.balance-=amountWithdraw;
		} else {
			throw new InsufficientFundsException(balance);
		}
		return this.balance;
	}
	public void deposit(double moneyNeed){
		this.balance+=moneyNeed;
	}
	
}
