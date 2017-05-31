package lab1;

public class SubSet {

	public boolean hasSubSet(int[] set, int sum) {

		// for (int i = 0; i < set.length; i++) {
		// if (set[i] == sum) {
		// return true;
		// }
		// }
		// for (int i = 0; i < set.length; i++) {
		// for(int j =1; j < set.length; j++){
		//
		// if (set[i] + set[j] == sum) {
		// return true;
		// }
		// }
		// }
		//
		// for (int i = 0; i < set.length; i++) {
		// for(int j =1; j < set.length; j++){
		// for(int l =0; l<set.length; l++){
		// if (set[i] + set[j] + set[l] == sum) {
		// return true;
		// }
		// }
		//
		// }
		// }

		int[] counters = new int[set.length];

		for (int i = 0; i < counters.length; i++) {

			int tempSum = 0;

			for (int j = 0; j < counters.length && j < i; j++) {
				tempSum += set[counters[j]];
			}

			if (tempSum == sum) {
				return true;
			}

		}

		return false;
	}

	void incrementCounters(int[] counters) {

	}
}
