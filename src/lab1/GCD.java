package lab1;

public class GCD {

	public int getGcd(int m, int n) {
		int ret = 0;
		int max = Math.max(m, n);
		for (int i = 1; i <= max; i++) {
			if ((m % i == 0) && (n % i == 0)) {
				ret = i;
			}
		}
		return ret;
	}

}
