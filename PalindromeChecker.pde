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
