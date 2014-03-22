package self.abhi.sorts;

public class QuickSort {
	public static void main(String[] args) {

		int a[] = { 55, 12, 973, 85, 103, 5, 91, 4, 985, 973, 9576, 23412,
				24514, 43524 };
		quicksort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	private static void quicksort(int[] x, int left, int right) {
		int i, partitionedIndex;
		if (left >= right) {
			return;
		}
		partitionedIndex = left;
		for (i = left + 1; i <= right; i++)
			if (x[i] < x[left])
				swap(x, ++partitionedIndex, i);
		swap(x,left, partitionedIndex);
		quicksort(x, left, partitionedIndex - 1);
		quicksort(x, partitionedIndex + 1, right);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
