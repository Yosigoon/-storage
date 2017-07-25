package Test;

import java.util.Scanner;

public class CalculatorDemo3 {
	 
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        int left, right;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫번째 숫자 입력 :");
         left = scanner.nextInt();
        System.out.println("두번째 숫자 입력 :");
        right = scanner.nextInt();
 
        sum(left, right);
        avg(left, right);
 
     
    }
 
}