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
        
        System.out.println("ù��° ���� �Է� :");
         left = scanner.nextInt();
        System.out.println("�ι�° ���� �Է� :");
        right = scanner.nextInt();
 
        sum(left, right);
        avg(left, right);
 
     
    }
 
}