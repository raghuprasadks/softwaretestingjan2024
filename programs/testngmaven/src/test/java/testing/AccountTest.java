package testing;


import org.testng.Assert;
import org.testng.annotations.Test;

import testngmaven.Account;

public class AccountTest {
  @Test(priority=1)
  public void testOpenAccount() {
	  Account act= new Account();
	  int actnumactual = act.openAccount("rohith", "rohith@gmail.com", 3939399393L, 10101000L);
	  int actnumexpected = 1;
	  Assert.assertEquals(actnumactual, actnumexpected);
  }
  
  @Test(priority=2)
  public void testDeposit() {
	  Account act= new Account();
	  int actbalance = act.deposit(1, 10000);
	  int expectedbalance = 10000;
	  Assert.assertEquals(actbalance, expectedbalance);	  
  }

  @Test(priority=3)
  public void testWithdraw() {
	  Account act= new Account();
	  int actbalance = act.deposit(1, 10000);
	  actbalance = act.withdraw(1, 5000);
	  int expectedbalance = 5000;
	  Assert.assertEquals(actbalance, expectedbalance);	  
  }
  
  @Test(priority=4)
  public void testCheckBalane() {
	  Account act= new Account();
	  int actbalance = act.deposit(1, 10000);
	  actbalance = act.withdraw(1, 5000);
	  int expectedbalance = 5000;
	  actbalance=act.checkBalance(1);
	  Assert.assertEquals(actbalance, expectedbalance);	  
  }

}
