package Test;

import java.util.Scanner;

public class TimesTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단수를 입력하세요 : ");
		int user = sc.nextInt();
		int dan = 1, i = 1;
			   
		int pattern = 5, line = 1;
		int start = 0;
		while(true){
			if(dan >= i && dan <= user){
				System.out.format("%d X %d = %d\t",dan, i, dan*i);   
			}else if(dan <= user){
				System.out.format("            \t");
			}
			if(dan == user && dan == i){
				System.out.println();
				break; 
			}else if(dan % pattern == 0 && dan == i){
				start =  pattern * line++;
				dan = 1 + (start); i=1;
				System.out.println("\n");
			}else if(dan % pattern == 0){
				dan = start  + 1;
				i++;
				System.out.println();
			}else{
				dan++;
			}
		}
	}
}

		