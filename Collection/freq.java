import java.util.*;
import java.util.Collection;
import java.util.List;

public class Fre {
	public static void main(String args[])
	{
	
		List<String> l=new ArrayList<>();
        l.add("M.A. Chidambaram stadium");
		l.add("M.A. Chidambaram stadium");
		l.add("M.A. Chidambaram stadium");
		l.add("M. Chinnaswamy Stadium");
		l.add("M. Chinnaswamy Stadium");
		l.add("Wankhede Stadium");
		l.add("Eden Gardens");
		l.add("M.A. Chidambaram Stadium");
		l.add("M.A. Chidambaram stadium");
		int i=Collections.frequency(l,"M.A. Chidambaram stadium");
		System.out.println(i);
		
		
		
	}

}
