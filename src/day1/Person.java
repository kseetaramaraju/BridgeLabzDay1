package day1;

interface Wonderla
{
	
}
public class Person implements Wonderla
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		if(p1 instanceof Wonderla)
		{
			System.out.println(" Person p1 Can Enter To Wonderla ");
		}
		else
		{
			System.out.println(" Person p1 Please take ticket to enter in to wonderla ");
		}
	}

}
