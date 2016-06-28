###Java&Algorithms
- This project going to be an example of different algorithms written on Java.
To be confident with the algorithms you should know Java SE 8 and its patterns.
- Этот проект создается как пример реализации различных алгоритмов, написанных на Java.
Чтобы Вы могли легко ориентироваться в алгоритмах, Вам нужно, как минимум, знать Java SE 8 и его паттерны.
Описание алгоритмов смотрите в исходных файлах.

#### Prerequisites
- Java SE 8
- Maven > 3.0 

####Algorithms
- `Sorting` (Сортировка). The sorting algorithms described here use `Compareable` and `Comparator` interfaces to compare objects in a list. Additional generics were  used to be more flexible with elements. Please read about those technologies(patterns) before seeing algorithms.
<table>
  <tr>
    <th width="300px">Sorting</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Quicksort (Быстрая сортировка)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Quicksort.
		Two different algorithms:
	* Hoare (`info.kolegov.sort.quicksort.HoareQuickSorter`)
	* Lomuto (`info.kolegov.sort.quicksort.LomutoQuickSorter`)
    </td>
  </tr>
  <tr>
    <td>Mergesort (Сортировка слиянием)</td>
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
    <td>Heapsort (Пирамидальная сортировка)</td>
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
    <td>Insertion sort (Сортировка вставками)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Insertion_sort.
		Implementation`info.kolegov.sort.InsertionSorter`
    </td>
  </tr>
  <tr>
    <td>Selection sort (Сортировка выбором)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Selection_sort.
		Implementation`info.kolegov.sort.SelectionSorter`
    </td>
  </tr>
  <tr>
    <td>Bubble sort (Сортировка пузырьком)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Bubble_sort.
		Implementation`info.kolegov.sort.BubbleSorter`
    </td>
  </tr>
  <tr>
    <td>Tree sort (Сортировка с помощью двоичного дерева)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Binary_tree_sort.
		Implementation`info.kolegov.sort.TreeSorter`
    </td>
  </tr>
    <tr>
    <td>Shellsort (Сортировка Шелла)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Shellsort.
		Implementation`info.kolegov.sort.ShellSorter`
    </td>
  </tr>
</table>

- Algorithms with `Arrays` (Алгоритмы, основанные на массивах).
<table>
  <tr>
    <th width="300px">Arrays</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Kth Largest Element (К-ый наибольший элемент)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-kth-largest-element-in-an-array-java/.
		Implementation`info.kolegov.array.KthLargestElement`
    </td>
  </tr>
  <tr>
    <td>Rotate an array (Сдвиг(?) массива)</td>
    <td>
		Main resource is http://www.programcreek.com/2015/03/rotate-array-in-java/.
		Implementation`info.kolegov.array.Rotate`
    </td>
  </tr>
  <tr>
    <td>Find Peak Element (Найти точку максимума)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/02/leetcode-find-peak-element/.
		Implementation`info.kolegov.array.FindPeakElement`
    </td>
  </tr>
</table>

- Algorithms with `Strings` (Алгоритмы со строками).
<table>
  <tr>
    <th width="300px">Strings</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Isomorphic String (Изоморфные строки)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-isomorphic-strings-java/.
		Implementation`info.kolegov.string.IsomorphicString`
    </td>
  </tr>
  <tr>
    <td>Reverse Words in a String (Реверсирование(?) слов в строке)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/.
		Implementation`info.kolegov.string.ReverseWordsInString`
    </td>
  </tr>
  <tr>
    <td>Word Ladder (Игра "Цепь слов")</td>
    <td>
		Main resource is http://www.programcreek.com/2012/12/leetcode-word-ladder/.
		Implementation`info.kolegov.string.WordLadder`
    </td>
  </tr>
  <tr>
    <td>Length of Last Word</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-length-of-last-word-java/.
		Implementation`info.kolegov.string.LengthofLastWord`
    </td>
  </tr>
</table>

- Algorithms on `Graphs` (Алгоритмы на графах).
<table>
  <tr>
    <th width="300px">Graphs</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Breadth-first search (BFS) (Обход в ширину)</td>
    <td>
    Implementation`info.kolegov.graph.BreadthFirstSearcher`
		Main resources are:
	* https://en.wikipedia.org/wiki/Breadth-first_search
	* Data Structures & Algorithms in Java. Robert Lafore. Second Edition
    </td>
  </tr>
  <tr>
    <td>Depth-first search (DFS) (Обход в глубину)</td>
    <td>
    Implementation`info.kolegov.graph.DepthFirstSearcher`
		Main resources are:
	* https://en.wikipedia.org/wiki/Depth-first_search
	* Data Structures & Algorithms in Java. Robert Lafore. Second Edition
    </td>
  </tr>
</table>

- Other algorithms (Другие алгоритмы).
<table>
  <tr>
    <td>Merge Intervals (Объединение интервалов)</td>
    <td>
    Main resource is http://www.programcreek.com/2012/12/leetcode-merge-intervals/.
    Implementation`info.kolegov.other.MergeIntervals`
    </td>
  </tr>
</table>
