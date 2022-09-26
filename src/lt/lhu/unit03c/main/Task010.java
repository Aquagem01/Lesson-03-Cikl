package lt.lhu.unit03c.main;

public class Task010 {

	public static void main(String[] args) {
		long sum=1;
			for(long a=1;a<=200;a++) {
			sum = (long)(sum*Math.pow(a, 2));}
		System.out.print(sum);
		}

}
