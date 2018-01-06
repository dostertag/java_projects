import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
	public double mean;
	public double stddev;
	public double confidenceLo;
	public double confidenceHi;
	private int size;
	private int trials;
	// private Percolation perc;
	private double[] results;
	
	
	public PercolationStats(int n, int trials) {
		// perform trials independent experiments on an n-by-n grid
		if( n <= 0 || trials <= 0) {
			throw new IllegalArgumentException("n and t have to  be greater than 0!");
		}
		size = n;
		this.trials = trials;
		// perc = new Percolation(n);
		results = new double[trials];
		for(int i = 0; i < trials; i++) {
			Percolation perc = new Percolation(size);
			while(!perc.percolates()) {
				int row = StdRandom.uniform(1, size + 1);
				int column = StdRandom.uniform(1, size + 1);
				if(!perc.isOpen(row, column) && !perc.isFull(row, column)) {
					perc.open(row, column);
				}
			}
			results[i] = (double) perc.numberOfOpenSites() / (size * size);
		}
		
	}
	
	public double mean() {
		// sample mean of percolation threshold
		return StdStats.mean(results);
	}
	
	public double stddev() {
		// sample standard deviation of percolation threshold
		return StdStats.stddev(results);
	}
	
	public double confidenceLo() {
		// low endpoint of 95% confidence interval
		return mean() - ((1.96 * stddev()) / Math.sqrt(trials));
	}
	
	public double confidenceHi() {
		// high endpoint of 95% confidence interval
		return mean() + ((1.96 * stddev()) / Math.sqrt(trials));
	}
	
	public static void main(String[] args) {
		// test clients
        PercolationStats ps = new PercolationStats(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        
        String confidence = ps.confidenceLo() + ", " + ps.confidenceHi();
        StdOut.println("mean                    = " + ps.mean());
        StdOut.println("stddev                  = " + ps.stddev());
        StdOut.println("95% confidence interval = " + confidence);       
	}
}
