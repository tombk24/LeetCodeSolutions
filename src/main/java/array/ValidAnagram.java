package array;

import java.util.Arrays;
import java.util.Collections;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        var firstArray = s.toCharArray();
        var secondArray = t.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for(var index = 0; index < firstArray.length; index++){
            if(firstArray[index] != secondArray[index]){
                return false;
            }
        }

        return true;
    }
}
