package t1_if;

import java.util.Scanner;

// 3과목의 점수를 입력받는다. 이때 3과목의 평균점수가 60점이상이고,각 과목당 40점 이상이면'합격',그렇지 않으면 '불합격'
public abstract class Test3_3 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int jum1, jum2, jum3, tot, avg;
		String str = "";
		System.out.print("첫번째 과목의 점수는? "); jum1 = sc.nextInt();
		System.out.print("두번째 과목의 점수는? "); jum2 = sc.nextInt();
		System.out.print("세번째 과목의 점수는? "); jum3 = sc.nextInt();
		
		avg = (jum1 + jum2 + jum3) / 3;
		// ||  => avg < 60 ||  jum1 <40 둘중 하나라도 맞으면 되는데 더 비교하기 편한것을 앞에 두면좋다
		if(avg < 60 ||  jum1 <40 || jum2 < 40 || jum3 < 40) {
			str = "불합격";
		}
		else {
			str = "합격";
								
			System.out.println("당신은 " + str + " 입니다.");
		}
		sc.close();
	}
}
