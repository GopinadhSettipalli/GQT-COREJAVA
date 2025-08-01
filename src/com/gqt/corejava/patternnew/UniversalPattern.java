package com.gqt.corejava.patternnew;

import java.util.Scanner;
/**
 * @author Durga
 * @category patterns
 * @description This is an example for Universal Pattern
 */
public class UniversalPattern {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
				   i==(n/2) || j==(n/2) ||
				   i==j || i+j==(n-1) ||
				   i+j==(n/2) || j-i==(n/2) || i-j==(n/2) || i+j==((n-1)+(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
				   i==(n/2) || j==(n/2) ||
				   i==j || i+j==(n-1) ||
				   i+j==(n/2) || j-i==(n/2) || i-j==(n/2) || i+j==((n-1)+(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
