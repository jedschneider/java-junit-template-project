package uk.co.placona.helloWorld;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorld {
  private String str;

  public HelloWorld(String password){
    str = password;
  }

  public Boolean passwordValid(){
    return !matchesWords() && longEnough();
  }

  public Boolean matchesWords(){
    return str.contains("test") || str.contains("book");
  }

  public Boolean longEnough(){
    return str.length() >= 7;
  }

  public Boolean hasSpecialChar(){
    Pattern pattern = Pattern.compile("[@!]");
    Matcher matcher = pattern.matcher(str);
    if ( matcher.find() ){
      return true;
    }
    else{
      return false;
    }
  }

}
