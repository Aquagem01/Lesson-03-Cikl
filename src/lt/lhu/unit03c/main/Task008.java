package lt.lhu.unit03c.main;

public class Task008 {

	public static void main(String[] args) {
		int a = 9;
		int b = 18;
		int c = 3;
		int h = 1;
		if (a>b) {
			int temp = b;
			b=a;
			a = temp;}
		int y = 0;
		while (b>=a) {
			int x = a;
			if (x==15) {
				y=(x+c)*2;
				}if (x!=15) {
					y=(x-c)+6;
				}
				System.out.printf("\t%4d\t%4d\t\n", x, y);
				a++;
				h++;
		}

	}

}
