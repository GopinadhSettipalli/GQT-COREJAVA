package com.gqt.corejava.patternnew;

import java.util.Scanner;

/**
 * @author Lenovo
 * @category patterns
 * @description This is an example of conditional pattern
 */
public class NewPattern3 {

	/**
	 * @param args
	 * @description This contains source code for the pyramid pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
			sc.close();
		}
	}
}
