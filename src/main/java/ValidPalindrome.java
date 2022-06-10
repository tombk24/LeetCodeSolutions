import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindromeOld(String str) {
        str = str.replaceAll(
                "[^a-zA-Z0-9]", "")
                .replace(" ", "")
                .toLowerCase();

        var strLength = str.length();
        for (var index = 0; index < (strLength/2); index++){
            var firstChar = str.charAt(index);
            var lastChar = str.charAt(strLength - index - 1);

            if(firstChar != lastChar) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(String str) {
        str = str.toLowerCase();

        var head = 0;
        var tail = str.length() - 1;

        while(head < tail) {
            var headChar = str.charAt(head);
            var tailChar = str.charAt(tail);
            if(!Character.isLetterOrDigit(headChar)){
                head++;
            } else if(!Character.isLetterOrDigit(tailChar)){
                tail--;
            } else {
                if(headChar != tailChar){
                    return false;
                }

                head++;
                tail--;
            }
        }

        return true;
    }
}
