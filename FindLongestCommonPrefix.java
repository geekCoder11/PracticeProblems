import java.util.*;

class FindLongestCommonPrefix {
    
    public static String mergeTheResult(String strOne, String strTwo) {
        String result = "";
        int lengthofstrOne = strOne.length(), lengthofstrTwo = strTwo.length();
 
        for (int i = 0, j = 0; i <= lengthofstrOne - 1 &&
                j <= lengthofstrTwo - 1; i++, j++) {
            if (strOne.charAt(i) != strTwo.charAt(j)) {
                break;
            }
            
            result = result + strOne.charAt(i);
            //System.out.println("result: "+result);
        }
        return (result);
    }
    
    public static String findCommonPrefix(String S[], int low, int high) {
        if (low == high) {
            return (S[low]);
        }
 
        if (high > low) {
            int mid = low + (high - low) / 2;
 
            String str1 = findCommonPrefix(S, low, mid);
            String str2 = findCommonPrefix(S, mid + 1, high);
 
            return (mergeTheResult(str1, str2));
        }
        return "";
    }
 
    public static void main(String args[]) {
     
        String s[] = {"flower","flow","flight"};
        System.out.println("common prefix:  "+findCommonPrefix(s, 0, s.length- 1));
    }
}
