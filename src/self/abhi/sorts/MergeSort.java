package self.abhi.sorts;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = {2,1};
		int[] retval = mergeSort(array, 0, array.length - 1);
		for (int i = 0; i < retval.length; i++) {
			System.out.println(retval[i]);
		}
	}

	public static int[] mergeSort(int[] array, int left, int right) {
		if (right < left)
			return new int[] {};
		else if (right > left) {
			int mid = left + (right - left) / 2;

			int[] leftA = mergeSort(array, left, mid);
			int[] rightA = mergeSort(array, mid + 1, right);

			return merge(leftA, rightA);
		} else {
			return new int[] { array[left] };
		}
	}

	public static int[] merge(int[] leftA, int[] rightA) {
		int[] retval = new int[leftA.length + rightA.length];
		int left = 0, right = 0, index = 0;

		while (left < leftA.length && right < rightA.length) {
			if (leftA[left] <= rightA[right]) {
				retval[index++] = leftA[left++];
			} else {
				retval[index++] = rightA[right++];
			}
		}
		while (left < leftA.length) {
			retval[index++] = leftA[left++];
		}
		while (right < rightA.length) {
			retval[index++] = rightA[right++];
		}
		return retval;
	}
}