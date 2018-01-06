
public class PercolationStats {
	public double mean;
	public double stddev;
	public double confidenceLo;
	public double confidenceHi;
	private int size;
	private int trials;
	private Percolation perc;
	
	
	public PercolationStats(int n, int trials) {
		// perform trials independent experiments on an n-by-n grid
		size = n;
		this.trials = trials;
		perc = new Percolation(n);
		
	}
	
	public double mean() {
		// sample mean of percolation threshold
		return mean;
	}
	
	public double stddev() {
		// sample standard deviation of percolation threshold
		return stddev;
	}
	
	public double confidenceLo() {
		// low endpoint of 95% confidence interval
		return confidenceLo;
	}
	
	public double confidenceHi() {
		// high endpoint of 95% confidence interval
		return confidenceHi;
	}
	
	public static void main(String[] args) {
		// test client
	}
}
