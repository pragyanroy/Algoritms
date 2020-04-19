package SortingAlgorithms;
public interface SortTool {
	public final static int COMP_LESS = -1;
	public final static int COMP_EQUAL = 0;
	public final static int COMP_MORE =  1;
	
    IllegalArgumentException err1 = 
    		new IllegalArgumentException("Not Compatible");
	
	int compare(Object x1,Object x2);
	

}
 
