package lt.lhu.unit03c.main;

public class Task009 {

	public static void main(String[] args) {
		double sum = 0;
		for (double a=1;a<=100;a++) {
			sum += Math.pow(a,2);
		}
System.out.print(" "+sum);
	}

}
