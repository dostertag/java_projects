import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {
	
//	private WeightedQuickUnionUF ufBottom;
//	private WeightedQuickUnionUF ufTop;
	private WeightedQuickUnionUF findIt;
	private int virtualTop;
	private int virtualBottom;
	private boolean[][] openedSites;
	private int length;
	private int numOpenSites;
	
	
	public Percolation(int n) {
		// create n by n grid, with all sites blocked
		if (n <= 0) {
			throw new IllegalArgumentException("n needs to be larger than 0");
		}
		openedSites = new boolean[n][n];
		virtualTop = n * n;
		virtualBottom = n * n + 1;
		length = n;
		findIt = new WeightedQuickUnionUF(n * n + 2);
		// ufBottom = new WeightedQuickUnionUF(n * n + 2);
		// ufTop = new WeightedQuickUnionUF(n * n + 1);
		numOpenSites = 0;
		
		/*
		 * 	to visualize the grid as a single array - it's like so in a 4x4 scenario:
		 *    [ 0, 1, 2, 3,
		 * 		4, 5, 6, 7,
		 * 		8, 9, 10, 11,
		 * 		12, 13, 14, 15, 
		 * 
		 * 		16 = virtual top
		 * 		17 = virtual bottom ]
		 *  so, to union ( row 2, column 2 ) would need to call 
		 *  union(5, 1) 
		 */
		
	}
	
	public void open(int row, int column) {
		// open site -row, col- if it isn't open already
		if (isInBounds(row, column)) {
			openedSites[row - 1][column - 1] = true;
			numOpenSites++;
			if (row == this.length) {
				findIt.union((row - 1) * length + column - 1, virtualBottom);
			}
			if (row == 1) {
				findIt.union(row - 1, virtualTop);
			}
			if (row > 1 && isOpen(row - 1, column)) {
				findIt.union((row - 1) * length + column - 1, (row - 2) * length + column - 1);
			}
			if (row < length && isOpen(row + 1, column)) {
				findIt.union((row -1) * length + column - 1, row * length + column - 1);
			}
			if (column > 1 && isOpen(row, column - 1)) {
				findIt.union((row - 1) * length + column - 1, (row - 1) * length + column - 1);
			}
			if (column < length && isOpen(row, column + 1)) {
				findIt.union((row - 1) * length + column - 1, (row - 1) * length + column);
			}
		} else {
			throw new IndexOutOfBoundsException();
		}
		
	}
	
	public boolean isOpen(int row, int col) {
		// is site -row, col- open?
		if (isInBounds(row, col)) {
			return openedSites[row - 1][col - 1];
		}
		throw new IndexOutOfBoundsException();
		
	}
	
	public boolean isFull(int row, int col) {
		// is site -row, col- blocked?
		if (isInBounds(row, col)) {
			return !openedSites[row - 1][col - 1];
		}
		throw new IndexOutOfBoundsException();
		
	}
	
	public Integer numberOfOpenSites() {
		// number of open sites
		return numOpenSites;
	}
	
	public boolean percolates() {
		// does the system percolate?
		return findIt.connected(virtualTop, virtualBottom);
	}
	
	private boolean isInBounds(int i, int j) {
		return !(i < 1 || i > length || j < 1 || j > length);
	}
	
}
