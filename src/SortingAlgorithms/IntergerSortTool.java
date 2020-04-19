package SortingAlgorithms;

public class IntergerSortTool implements SortTool{


	public int compare(Object x1, Object x2) {
       
		if ((x1 instanceof Integer) && (x2 instanceof Integer))
		{
			int n1 = ((Integer)x1).intValue();
			int n2 = ((Integer)x2).intValue();
			if (n1>n2)
				 return COMP_MORE;
			else if (n2>n1)
				  return COMP_LESS;
			else 
				  return COMP_EQUAL;
		}
		
		else
			throw SortTool.err1;
		
	}

}
