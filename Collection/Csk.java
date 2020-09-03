import java.util.ArrayList;
import java.util.List;

public class Csk {
	int i,sum=0;
	float avg;
	public static void main(String args[])
	{
		int i,sum=0;
		float avg=0;
		List<Integer> l=new ArrayList<>();
		l.add(200);
		l.add(210);
		l.add(180);
		l.add(176);
		l.add(192);
		System.out.println(l.size());
		System.out.println(l);
		for(i=0;i<l.size();i++)
		{
		sum=sum+l.get(i);
		avg=sum/l.size();
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
