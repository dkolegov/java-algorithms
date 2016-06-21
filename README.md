###Algorithms&Java
This project going to be an example of different algorithms written on Java.
To be confident with the algorithms you should know Java SE and its patterns.
- Sorting
The sorting algorithms described here use `Compareable` and `Comparator` interfaces to compare objects in a collection(list). Additional generics were  used to be more flexible with elements. Please read about those technologies(patterns) before seeing algorithms.
<table>
  <tr>
    <th width="300px">Sorting</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Quicksort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Quicksort
		Two different algorithms:
	* Hoare (`info.kolegov.sort.quicksort.HoareQuickSort`) and
	* Lomuto (`info.kolegov.sort.quicksort.LomutoQuickSort`)
    </td>
  </tr>
  <tr>
    <td>Mergesort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Merge_sort
		Two different algorithms:
	* Top-down implementation (`info.kolegov.sort.mergesort.BottomUpMergeSort`) and
	* Bottom-up implementation (`info.kolegov.sort.mergesort.TopDownMergeSort`)
    </td>
  </tr>
</table>