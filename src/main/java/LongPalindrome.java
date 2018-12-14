
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongPalindrome {
    public static void main(String[] args){
        String input = "bbbab";
        LongPalindrome longPalindrome = new LongPalindrome();
        int response = longPalindrome.longestPalindromeSubseq(input);
        System.out.println("Longest Palindromic Subsequence length : " + response);
    }

    public int longestPalindromeSubseq(String s) {
        List<Integer> lengths = new ArrayList<Integer>();
        int max = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String pal = s.substring(i,j);
                int mid = pal.length()/2;
                if (mid == 0){
                    lengths.add(pal.length());
                }else if(pal.length() % 2 != 0){
                    if(pal.substring(0,mid).equals(pal.substring(mid+1))){
                        lengths.add(pal.length());
                    }
                    System.out.println("String : " + pal + " first : " + pal.substring(0,mid) + " last : " + pal.substring(mid+1));
                }else if(pal.length() % 2 ==0){
                    if(pal.substring(0,mid).equals(pal.substring(mid))){
                        lengths.add(pal.length());
                    }
                    System.out.println("String : " + pal + " first : " + pal.substring(0,mid) + " last : " + pal.substring(mid));
                }
            }
        }
        Collections.sort(lengths);
        Collections.reverse(lengths);
        return lengths.get(0);
    }
}
