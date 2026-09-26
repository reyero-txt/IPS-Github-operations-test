package test;

public class Main {
	
	public static void main(String[] args) {
		double time = System.currentTimeMillis();
		int counter = 1;
		for(int i=0; i<10000; i++) {
			for(int j=0; j<10000; j++) {
				counter *= 2;
			}
		}
		double timeAfter = System.currentTimeMillis();
		System.out.println(timeAfter - time);
	}
}
