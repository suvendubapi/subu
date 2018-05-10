
interface Demo1 
{
	void test1();
	void test2();
}
public class Demo2 implements Demo1
{
	public void test1()
	{
		System.out.println("i am test1 method");
	}
	public void test2()
	{
		System.out.println("i am test2 method");
	}
	public static void main(String[]args)
	{
		Demo2 d = new Demo2();
		d.test1();
		d.test2();
	}
}
