package allbase;

public class febonacinum {

	public static void main(String[] args) {
		int febo1 = 1, febo2 = 1, febonaci = 1;
		for (int i =1; i <=5; i++) {
			febonaci = febo1 + febo2;
			febo1 = febo2;
			febo2 = febonaci;
		}
		System.out.println("febonaci number is:" + "" + febonaci);
	}

}
