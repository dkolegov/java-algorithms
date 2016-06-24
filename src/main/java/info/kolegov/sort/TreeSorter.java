package info.kolegov.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import info.kolegov.datastructure.BinaryTree;

public class TreeSorter extends Sorter {

	@Override
	public <T> void sort(Object[] array, Comparator<? super T> c) {
		
		// build a binary tree
		BinaryTree<T> searchTree = new BinaryTree<>();
		for (int i=0; i< array.length; i++) {
			searchTree.insert(array[i], c);
		}
		// retrieve sorted array from the built tree.
		List<T> result = new ArrayList<>();
	    inOrder(searchTree, result);
	    copy(array, result.toArray());
	}


    public <T> void inOrder(BinaryTree<T> searchTree, List<T> result) {
	    if (searchTree.getNode() == null) {
	        return;
    	} else {
	        inOrder(searchTree.getLeftSubTree(), result);
	        result.add(searchTree.getNode());
	        inOrder(searchTree.getRightSubTree(), result);
    	}
    }
}
