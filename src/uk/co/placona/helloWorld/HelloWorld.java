package uk.co.placona.helloWorld;

public class HelloWorld {
  private String str;

  public HelloWorld(String password){
    str = password;
  }

  public Boolean passwordValid(){
    return !matchesWords() && longEnough();
  }

  public Boolean matchesWords(){
    return str.matches("test|book");
  }

  public Boolean longEnough(){
    return str.length() >= 7;
  }

}
