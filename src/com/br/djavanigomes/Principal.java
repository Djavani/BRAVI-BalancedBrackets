package com.br.djavanigomes;

import java.util.Scanner;

public class Principal {	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);				
		BalancedBrackets balanced = new BalancedBrackets();
		
		String userText;
		int result;
		
		System.out.println("## Bravi Brackets Sequence ##");
		System.out.println("A bracket is considered to be any one of the following characters: (, ),\r\n" + 
				"{, }, [, or ].");
		System.out.println("Type a sequence of Brackets and press Enter Key:");
		
		sc.hasNext();
		
		userText = sc.nextLine();		
		result = (balanced.hasBalancedBrackets(userText));
		
		if(result == 0) {
			System.out.println( "The sequence is not valid.");			
		}else {
			System.out.println( "The sequence is valid.");
		}
		
		System.out.println("## End of the Bravi Brackets Sequence test ##");
	}
}
