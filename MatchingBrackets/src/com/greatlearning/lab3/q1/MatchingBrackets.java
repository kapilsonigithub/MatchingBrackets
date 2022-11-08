//this_(is_good)_to_be_working_{for}_all_types_with_((test)_*_testing)}
// ([[{}]])		// The entered String has Balanced Brackets.
// ([[{}]]))	// The entered Strings do NOT contain Balanced Brackets.

package com.greatlearning.lab3.q1;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {

	public static boolean checkBrackets(String input)
	{
		Stack <Integer> stack = new Stack <> ();
		String openingBrackets = "([{<";
		String closingBrackets = ")]}>";
		String brackets = openingBrackets+ closingBrackets;
		
		for (char ch: input.toCharArray() )
		{
			if(!brackets.contains(ch+"")) {
				//System.out.print(ch+"");
				continue;
			}
			int index = -1;
			if((index=openingBrackets.indexOf(ch))!=-1){
				stack.push(index);
				continue;
			}
			//index=closingBrackets.indexOf(ch);
			if (stack.isEmpty()) {
				return false;
			}
			index = stack.pop();
			if(ch!=closingBrackets.charAt(index)) {
				return false;
			}
			
		}
		return stack.isEmpty();
	}
	public static void main (String[] args)
	{
		try(Scanner scr = new Scanner (System.in);){			
			System.out.println("Enter set of brackets for testing Balance Brackets or not (without spaces): ");
			String input = scr.next();
			System.out.println("\n\n");
			boolean check = checkBrackets(input);
			if (check)
			{
				System.out.println("The entered String has Balanced Brackets.");
			}
			else
			{
				System.out.println("The entered Strings do NOT contain Balanced Brackets.");
			}
		}
	}
}
