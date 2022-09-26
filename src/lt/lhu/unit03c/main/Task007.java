package lt.lhu.unit03c.main;

public class Task007 {

	public static void main(String[] args) {
		int a = -6;
		int b = -16;
		int y = 0;
		int h = 1;
		if (a>b) {// делаем так, чтобы а всегда было меньше b
			int temp;
			temp = a;
			a = b;
			b = temp;}
		// System.out.printf(a + " " +b); // проверочка того, что наделали ) работает
		int x = a;//загоняем х в точку а
		
			while (b>a) {
				if (x>2) {
				y=x;
				} else{
				y=-x;}
				System.out.printf("\t%4d\t%4d\t\n", x, y);
				a = a+h;
				x = x+h;
			}
		}
		


}
