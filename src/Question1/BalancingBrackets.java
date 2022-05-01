package Brackets;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	// function to check if brackets are balanced
	public boolean isBalanced(String exp) {

		Stack<Character> bStack = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				bStack.push(ch);
				continue;
			}

	// System.out.println("top ->" + bStack.peek());

			if (ch == ')') {
				if (!bStack.isEmpty() && bStack.peek() == '(') {
					bStack.pop();
				} else {
					return false;
				}
			} else if (!bStack.isEmpty() && ch == '}') {
				if (bStack.peek() == '{') {
					bStack.pop();
				} else {
					return false;
				}
			} else if (!bStack.isEmpty() && ch == ']') {
				if (bStack.peek() == '[') {
					bStack.pop();
				} else {
					return false;
				}
			}
	// System.out.println("top ->" + bStack.peek());
		}

		if (bStack.isEmpty())
			return true;
		else
			return false;
	}
 
    // Driver code
    static Scanner sc = new Scanner(System.in);
    static BalancingBrackets balancingBrackets = new BalancingBrackets();

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String bracketsString = sc.nextLine();

        if ( balancingBrackets.isBalanced(bracketsString) )
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}
