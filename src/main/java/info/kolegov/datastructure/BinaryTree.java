package info.kolegov.datastructure;

import java.util.Comparator;

public class BinaryTree<T> {

	private BinaryTree<T> leftSubTree;
    private T node;
    private BinaryTree<T> rightSubTree;

	public T getNode() {
		return node;
	}
	public void setNode(T node) {
		this.node = node;
	}
	public BinaryTree<T> getLeftSubTree() {
		if (leftSubTree == null) {
			leftSubTree = new BinaryTree<>();
		}
		return leftSubTree;
	}
	public void setLeftSubTree(BinaryTree<T> leftSubTree) {
		this.leftSubTree = leftSubTree;
	}
	public BinaryTree<T> getRightSubTree() {
		if (rightSubTree == null) {
			rightSubTree = new BinaryTree<>();
		}
		return rightSubTree;
	}
	public void setRightSubTree(BinaryTree<T> rightSubTree) {
		this.rightSubTree = rightSubTree;
	}

	@SuppressWarnings({"fallthrough", "rawtypes", "unchecked"})
	protected int compare(Object a, Object b, Comparator<? super T> c) {
		if (c == null) {
			Comparable el = (Comparable) a;
			return el.compareTo(b);
		} else {
			return c.compare((T) a,(T) b);
		}
	}

	public void insert(Object item, Comparator<? super T> c) {
		insert(this, item, c);
	}

	@SuppressWarnings({"fallthrough", "unchecked"})
    private void insert(BinaryTree<T> searchTree, Object item, Comparator<? super T> c) {
	    if (searchTree.getNode() == null) {
	        searchTree.setNode((T) item);
	    } else {
	        if (compare(item, searchTree.getNode(), c) < 0) {
	        	insert(searchTree.getLeftSubTree(), item, c);
	        } else {
	            insert(searchTree.getRightSubTree(), item, c);
	        }
	    }
    }
}
