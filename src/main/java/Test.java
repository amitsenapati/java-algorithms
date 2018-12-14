public class Test {

    private static final String INP_STR = "This string has a palindrome malayalam";

    public static void main(String[] args) {

        System.out.println(removePalindromeWord(INP_STR));
    }

    private static String removePalindromeWord(String line){
        String[] words = line.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(!checkPalindrome(word)){
                sb.append(word).append(" ");
            }
        }
        return sb.toString();
    }



    private static boolean checkPalindrome(String word){
        int mid = word.length() / 2;
        for(int i = 0; i <= mid; i++){
            Character startChar = word.charAt(i);
            Character endChar = word.charAt(word.length() - i - 1);
            if(!startChar.equals(endChar))
                return false;
        }
        return true;
    }

}
