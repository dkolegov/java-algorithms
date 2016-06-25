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
- Algorithms with strings.
<table>
  <tr>
    <th width="300px">Strings</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Isomorphic String</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-isomorphic-strings-java/.
		Implementation`info.kolegov.string.IsomorphicString`
    </td>
  </tr>
  <tr>
    <td>Reverse Words in a String</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/.
		Implementation`info.kolegov.string.ReverseWordsInString`
    </td>
  </tr>
  <tr>
    <td>Word Ladder</td>
    <td>
		Main resource is http://www.programcreek.com/2012/12/leetcode-word-ladder/.
		Implementation`info.kolegov.string.WordLadder`
    </td>
  </tr>
</table>
- Algorithms on graphs.
<table>
  <tr>
    <th width="300px">Graphs</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Breadth-first search (BFS)</td>
    <td>
    Implementation`info.kolegov.graph.BreadthFirstSearcher`
		Main resources are:
	* https://en.wikipedia.org/wiki/Breadth-first_search
	* Data Structures & Algorithms in Java. Robert Lafore. Second Edition
    </td>
  </tr>
  <tr>
    <td>Depth-first search (DFS)</td>
    <td>
    Implementation`info.kolegov.graph.DepthFirstSearcher`
		Main resources are:
	* https://en.wikipedia.org/wiki/Depth-first_search
	* Data Structures & Algorithms in Java. Robert Lafore. Second Edition
    </td>
  </tr>
</table>