public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();

      System.out.println(ex01.reverseString("hello world"));
      System.out.println(ex01.reverseString("Dad"));
      System.out.println(ex01.reverseString("Bsuiness School"));
      
        //Uncomment the following statements after finishing Exercise Four
        System.out.println(ex01.isStringPalindrome("hello world"));
        System.out.println(ex01.isStringPalindrome("Dad"));
        System.out.println(ex01.isStringPalindrome("radar"));
    }
    
    // Exercise One
    private String reverseString(String word) {
        String revWord = "";
        for(int i = 0; i < word.length(); i++){
            revWord = word.charAt(i) + revWord;
        }
        return revWord;
    }
    
    // Exercise Four
    private boolean isStringPalindrome(String word) {
        String rWord = "";
    for(int i = 0; i < word.length(); i++){
            rWord = word.charAt(i) + rWord;
    }
    if (rWord.toLowerCase().equals(word.toLowerCase())){
        return true;
        
    }
    else{
        return false;
    }
}
}
