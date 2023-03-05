package ex5_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread {

	public void startGame() {
		int n1 = new Random().nextInt(100)+1;
		int n2 = new Random().nextInt(100)+1;
		int total = n1+n2;
		
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
			for(int i=0; i<5; i++) {
				System.out.printf("%d + %d = \n",n1,n2);
				if(total == answer) {
					System.out.println("정답!!");
				} else {System.out.println("오답");}
	}
		
	}
	@Override
	public void run() {
	
		
		
	}
}

