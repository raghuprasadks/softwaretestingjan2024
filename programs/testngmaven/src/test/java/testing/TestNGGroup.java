package testing;

import org.testng.annotations.Test;

public class TestNGGroup {
  @Test(groups= {"smoketest"})
  public void first() {
  }
  
  @Test(groups= {"smoketest"})
  public void second() {
  }

  @Test(groups= {"regression"})
  public void third() {
  }
  
  @Test(groups= {"regression"})
  public void fourth() {
  }

}
