package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
  public static final String VALID_PASSWORD = "jeD3atsP@sta";

  @Test
  public void testpasswordValid(){
    HelloWorld hello = new HelloWorld(VALID_PASSWORD);
    assertEquals(true, hello.passwordValid());
  }

  @Test
  public void testMatchesBook(){
    HelloWorld hello = new HelloWorld("book");
    assertEquals(true, hello.matchesWords());
  }

  @Test
  public void testMatchesTest(){
    HelloWorld hello = new HelloWorld("test");
    assertEquals(true, hello.matchesWords());
  }

  @Test
  public void testMatchesLength(){
    HelloWorld hello = new HelloWorld("");
    assertEquals(false, hello.longEnough());
    HelloWorld hello2 = new HelloWorld("1234567");
    assertEquals(true, hello2.longEnough());
  }

  @Test
  public void testHasSpecialChar(){
    HelloWorld hello = new HelloWorld("@");
    assertEquals(true, hello.hasSpecialChar());
    HelloWorld hello2 = new HelloWorld("@ss");
    assertEquals(true, hello2.hasSpecialChar());
    HelloWorld hello3 = new HelloWorld("halt!");
    assertEquals(true, hello3.hasSpecialChar());
  }
}
