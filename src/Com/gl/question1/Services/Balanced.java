package Com.gl.question1.Services;

import java.util.Stack;

public class Balanced {

    public static String balancing(String s) {
        if(s.length()%2!=0) {
            return "The entered Strings do not contain Balanced Brackets";
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.pop() != '[') {
                    return "The entered Strings do not contain Balanced Brackets\n";
                }
            } else if (c == ')') {
                if (stack.pop() != '(') {
                    return "The entered Strings do not contain Balanced Brackets\n";
                }
            } else if (c == '}') {
                if (stack.pop() != '{') {
                    return "The entered Strings do not contain Balanced Brackets\n";
                }
            }

        }
        return "The entered String has Balanced Brackets\n";

    }
}
