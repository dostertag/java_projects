import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {
	
	private WeightedQuickUnionUF unionFindOne;
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
		unionFindOne = new WeightedQuickUnionUF(n * n + 2);
		numOpenSites = 0;
		
	}
	
	public void open(int row, int column) {
		// open site -row, col- if it isn't open already
		if (isInBounds(row, column)) {
			openedSites[row - 1][column - 1] = true;
			numOpenSites++;
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
		return unionFindOne.connected(virtualTop, virtualBottom);
	}
	
	private boolean isInBounds(int i, int j) {
		return !(i < 1 || i > length || j < 1 || j > length);
	}
	
}
