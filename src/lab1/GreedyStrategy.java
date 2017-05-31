package lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GreedyStrategy {

	public boolean hasSubSet(int[] arr, int sum) {

		Arrays.sort(arr);
		Set<Integer> sortedSet = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			int temp = sortedSet.stream().mapToInt(p -> p).sum();

			if (temp + arr[i] <= sum) {
				sortedSet.add(arr[i]);
			} else {
				break;
			}

		}

		return sortedSet.stream().mapToInt(p -> p).sum() == sum;
	}
}
