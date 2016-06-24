###Java&Algorithms
This project going to be an example of different algorithms written on Java.
To be confident with the algorithms you should know Java SE and its patterns.

#### Prerequisites
- Java 8
- Maven > 3.0 

####Algorithms
- Sorting. The sorting algorithms described here use `Compareable` and `Comparator` interfaces to compare objects in a list. Additional generics were  used to be more flexible with elements. Please read about those technologies(patterns) before seeing algorithms.
<table>
  <tr>
    <th width="300px">Sorting</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Quicksort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Quicksort.
		Two different algorithms:
	* Hoare (`info.kolegov.sort.quicksort.HoareQuickSorter`)
	* Lomuto (`info.kolegov.sort.quicksort.LomutoQuickSorter`)
    </td>
  </tr>
  <tr>
    <td>Mergesort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Merge_sort.
		Two different algorithms:
	* Top-down implementation
	(`info.kolegov.sort.mergesort.BottomUpMergeSorter`)
	* Bottom-up implementation
	(`info.kolegov.sort.mergesort.TopDownMergeSorter`)
    </td>
  </tr>
  <tr>
    <td>Heapsort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Heapsort.
		Two different algorithms:
	* Top-down implementation
	(`info.kolegov.sort.heapsort.SiftDownHeapsorter`)
	* Bottom-up implementation
	(`info.kolegov.sort.heapsort.SiftUpHeapsorter`)
    </td>
  </tr>
  <tr>
    <td>Insertion sort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Insertion_sort.
		Implementation`info.kolegov.sort.InsertionSorter`
    </td>
  </tr>
  <tr>
    <td>Selection sort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Selection_sort.
		Implementation`info.kolegov.sort.SelectionSorter`
    </td>
  </tr>
  <tr>
    <td>Bubble sort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Bubble_sort.
		Implementation`info.kolegov.sort.BubbleSorter`
    </td>
  </tr>
  <tr>
    <td>Tree sort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Binary_tree_sort.
		Implementation`info.kolegov.sort.TreeSorter`
    </td>
  </tr>
    <tr>
    <td>Shellsort</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Shellsort.
		Implementation`info.kolegov.sort.ShellSorter`
    </td>
  </tr>
</table>