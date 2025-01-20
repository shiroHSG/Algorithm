package Stack;

import java.util.Stack;

public class ValidParentheses {
    
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(' || c== '{' || c=='[')
                stack.push(c);
            else if(c == ')' || c== '}' || c==']')
                if(stack.isEmpty() || !isMatchingPair(stack.pop(),c))
                    return false;
        }
        //스택이 비어있으면 true, 남아있으면 false
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // 테스트 케이스
        String[] testCases = {
            "()", "()[]{}", "(]", "([{}])", "{[()]}(", "((({{[[]]}})))", "(()"
        };

        // 각 테스트 케이스에 대해 결과 출력
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " => Output: " + isValid(testCase));
        }
    }
}
