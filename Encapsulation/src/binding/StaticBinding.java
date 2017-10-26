

package binding;
import java.util.*;
public class StaticBinding 
{
	public static void main(String[] args) 
	{
		Collection c = new HashSet();
		StaticBinding et = new StaticBinding();
		et.sort(c);
	}
	//overloaded method takes Collection argument
	public Collection sort(Collection c)
	{
		System.out.println("Inside Collection sort method");
		return c;
	}
	//another overloaded method which takes HashSet argument which is sub class
	public Collection sort(HashSet hs)
	{
	System.out.println("Inside HashSet sort method");
	return hs;
	}
}