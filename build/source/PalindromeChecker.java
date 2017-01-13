import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup() {
  String lines[] = loadStrings("palindromes.txt");
  println("There are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) {
    if(palindrome(lines[i])) {
      println(lines[i] + " IS a palidrome.");
    } else {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}

public boolean palindrome(String word) {
  // remove spaces and makes it lowercase and removes all punctuation
  word = word.replaceAll("\\s+","").toLowerCase().replaceAll("[^A-Za-z0-9]", "");
  for(int i = 0; i < word.length()/2; i++) {
    if(word.charAt(i) != word.charAt(word.length()-1-i)) return false;
  }
  return true;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
