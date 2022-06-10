package stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // "()[]{}"
        // "([{}])"
        // For each character, if it is an opening, add to stack.
        // if is closing, get item from top of stack, it they correspond, continue.
        var closeToOpenMappings = new HashMap<>();
        closeToOpenMappings.put('}', '{');
        closeToOpenMappings.put(']', '[');
        closeToOpenMappings.put(')', '(');
        var stack = new Stack<>();
        for(var character: s.toCharArray()){
            if(character == '{' || character == '(' || character == '['){
                stack.push(character);
            } else {
                if(stack.isEmpty()){return false;}
                var compareChar = stack.pop();
                if(compareChar != closeToOpenMappings.get(character)){
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
