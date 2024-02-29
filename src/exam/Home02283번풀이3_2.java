package exam;

import java.util.Scanner;

public class Home02283번풀이3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, cnt=0;
		
		System.out.print("2자리수를 입력하세요? ");
		su = sc.nextInt();
		
		//양수일때
		if(su >= 10) {
		while(su >= 1) {
			System.out.print(su + " \t");
			su--;
			cnt++;
			if(cnt % 5 ==0) System.out.println();
		}
	 }
		//음수일떄
		if(su <= -10) {
			while(su <= 1) {
				System.out.print(su + " \t");
				su++;
				cnt++;
				if(cnt % 5 ==0) System.out.println();
			}
		 }
		sc.close();
	}			
}
