package exam;

/*
 
 */
public class Home02281번풀이 {
	public static void main(String[] args) {
		int i=0, cnt2=0,cnt3=0,cnt5=0,tot2=0,tot3=0,tot5=0;
		
		while(i < 100) {
			i++;
			if(i % 2 == 0) {
				cnt2 += 1;//cnt2++
				tot2 += i;
			}
			else if(i % 3 == 0) {
				cnt3 += 1;//cnt3++
				tot3 += i;
			}
			else if(i % 5 == 0) {
				cnt5 += 1;//cnt5++
				tot5 += i;
			}			
		}
		System.out.println("2의배수 개수 : " + cnt2);
		System.out.println("3의배수 개수 : " + cnt3);
		System.out.println("5의배수 개수 : " + cnt5);
		System.out.println("2의배수 +3의 개수 -5의 개수  : " + (tot2+ tot3-tot5));
	}
}
