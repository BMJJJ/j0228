package t3class;

//1~100 까지의 홀수합
public class Test3 {
	public static void main(String[] args) {
		int i = -1, tot = 0;
		
		while(i < 99) {
			i = i +2; 
			tot = tot + i; 
		}
		
		System.out.println("1~100까지의 홀수합은? " + tot);
	}
}
