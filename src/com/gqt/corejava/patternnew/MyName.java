/**
 * 
 */
package com.gqt.corejava.patternnew;

import java.util.Scanner;

/**
 * 
 */
public class MyName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || (i==n-1&& j<=n/2) || j==n/2&&i>=n/2 || i==n/2&&j>=n/2 || j==n-1&&i>=n/2 )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//O
			for(int j=0;j<n;j++) {
				if( j==0 || i==0 || i==n-1 ||j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//P
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || j==n-1&&i<=n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//I
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) || i==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//N
			for(int j=0;j<n;j++) {
				if(i==j || j==0  ||j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   "); 
			//A
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || j==(n-1)  ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//D
			for(int j=0;j<n;j++) {
				if( j==0 || i==0 || i==n-1 ||j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//H
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n/2)  ) 
				{
					System.out.print("* ");
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
