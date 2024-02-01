package testngmaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest {
  @Test
  public void testOpenAccount() {
	  Account act= new Account();
	  int actnumactual = act.openAccount("rohith", "rohith@gmail.com", 3939399393L, 10101000L);
	  int actnumexpected = 1;
	  Assert.assertEquals(actnumactual, actnumexpected);
  }
}
