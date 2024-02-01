package testngmaven;

public class Account {
	
	static int accountnum=0;
	String name;
	String email;
	long mobile;
	int balance;
	long aadhar;
	
	
	public int openAccount(String name,String email,Long mobile,Long aadhar) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.aadhar = aadhar;
		this.balance=0;
		this.accountnum= this.accountnum+1;
		return this.accountnum;
		
	}
	
	public static void main(String args[]) {
		Account act1 = new Account();
		long actnum =act1.openAccount("raghu","raghu@gmail.com",9845547471L, 1234567891L);
		System.out.println("Account number is "+actnum);
		
		Account act2 = new Account();
		actnum =act2.openAccount("ravi","ravi.com",9845547471L, 1234567891L);
		System.out.println("Account number is "+actnum);
		
	}

}
