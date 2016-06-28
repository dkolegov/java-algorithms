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
    <td>Quicksort<br/>(Быстрая сортировка)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Quicksort.
		Two different algorithms:
	<br/>Hoare (`info.kolegov.sort.quicksort.HoareQuickSorter`)
	<br/>Lomuto (`info.kolegov.sort.quicksort.LomutoQuickSorter`)
    </td>
  </tr>
  <tr>
    <td>Mergesort<br/>(Сортировка слиянием)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Merge_sort.
		Two different algorithms:
	<br/>Top-down implementation
	(`info.kolegov.sort.mergesort.BottomUpMergeSorter`)
	<br/>Bottom-up implementation
	(`info.kolegov.sort.mergesort.TopDownMergeSorter`)
    </td>
  </tr>
  <tr>
    <td>Heapsort<br/>(Пирамидальная сортировка)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Heapsort.
		Two different algorithms:
	<br/>Top-down implementation
	(`info.kolegov.sort.heapsort.SiftDownHeapsorter`)
	<br/>Bottom-up implementation
	(`info.kolegov.sort.heapsort.SiftUpHeapsorter`)
    </td>
  </tr>
  <tr>
    <td>Insertion sort<br/>(Сортировка вставками)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Insertion_sort.
		<br/>Implementation`info.kolegov.sort.InsertionSorter`
    </td>
  </tr>
  <tr>
    <td>Selection sort<br/>(Сортировка выбором)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Selection_sort.
		<br/>Implementation`info.kolegov.sort.SelectionSorter`
    </td>
  </tr>
  <tr>
    <td>Bubble sort<br/>(Сортировка пузырьком)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Bubble_sort.
		<br/>Implementation`info.kolegov.sort.BubbleSorter`
    </td>
  </tr>
  <tr>
    <td>Tree sort<br/>(Сортировка с помощью двоичного дерева)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Binary_tree_sort.
		<br/>Implementation`info.kolegov.sort.TreeSorter`
    </td>
  </tr>
    <tr>
    <td>Shellsort<br/>(Сортировка Шелла)</td>
    <td>
		Main resource is https://en.wikipedia.org/wiki/Shellsort.
		<br/>Implementation`info.kolegov.sort.ShellSorter`
    </td>
  </tr>
</table>

- Algorithms with `Arrays` (Алгоритмы, основанные на массивах).
<table>
  <tr>
    <th width="300px">Arrays</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Kth Largest Element<br/>(К-ый наибольший элемент)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-kth-largest-element-in-an-array-java/.
		<br/>Implementation`info.kolegov.array.KthLargestElement`
    </td>
  </tr>
  <tr>
    <td>Rotate an array<br/>(Сдвиг(?) массива)</td>
    <td>
		Main resource is http://www.programcreek.com/2015/03/rotate-array-in-java/.
		<br/>Implementation`info.kolegov.array.Rotate`
    </td>
  </tr>
  <tr>
    <td>Find Peak Element<br/>(Найти точку максимума)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/02/leetcode-find-peak-element/.
		<br/>Implementation`info.kolegov.array.FindPeakElement`
    </td>
  </tr>
</table>

- Algorithms with `Strings` (Алгоритмы со строками).
<table>
  <tr>
    <th width="300px">Strings</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Isomorphic String<br/>(Изоморфные строки)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-isomorphic-strings-java/.
		<br/>Implementation`info.kolegov.string.IsomorphicString`
    </td>
  </tr>
  <tr>
    <td>Reverse Words in a String<br/>(Реверсирование(?) слов в строке)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/.
		<br/>Implementation`info.kolegov.string.ReverseWordsInString`
    </td>
  </tr>
  <tr>
    <td>Word Ladder<br/>(Игра "Цепь слов")</td>
    <td>
		Main resource is http://www.programcreek.com/2012/12/leetcode-word-ladder/.
		<br/>Implementation`info.kolegov.string.WordLadder`
    </td>
  </tr>
  <tr>
    <td>Length of Last Word<br/>(Длина последнего слова)</td>
    <td>
		Main resource is http://www.programcreek.com/2014/05/leetcode-length-of-last-word-java/.
		<br/>Implementation`info.kolegov.string.LengthofLastWord`
    </td>
  </tr>
</table>

- Algorithms on `Graphs`(Алгоритмы на графах).
<table>
  <tr>
    <th width="300px">Graphs</th><th width="300px"></th>
  </tr>
  <tr>
    <td>Breadth-first search (BFS)<br/>(Обход в ширину)</td>
    <td>
    Implementation`info.kolegov.graph.BreadthFirstSearcher`
		Main resources are:
	<br/>https://en.wikipedia.org/wiki/Breadth-first_search
	<br/>Data Structures & Algorithms in Java. Robert Lafore. Second Edition
    </td>
  </tr>
  <tr>
    <td>Depth-first search (DFS)<br/>(Обход в глубину)</td>
    <td>
    Implementation`info.kolegov.graph.DepthFirstSearcher`
		Main resources are:
	<br/>https://en.wikipedia.org/wiki/Depth-first_search
	<br/>Data Structures & Algorithms in Java. Robert Lafore. Second Edition
    </td>
  </tr>
</table>

- Other algorithms (Другие алгоритмы).
<table>
  <tr>
    <td>Merge Intervals<br/>(Объединение интервалов)</td>
    <td>
    Main resource is http://www.programcreek.com/2012/12/leetcode-merge-intervals/.
    Implementation`info.kolegov.other.MergeIntervals`
    </td>
  </tr>
</table>
