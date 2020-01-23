package pack;
public class A
{
	B b1;
	A()
	{
		System.out.println("class A");
	}  
	
	public B getB1() {
		return b1;
	}

	public void setB1(B b1) {
		this.b1 = b1;
	}

	public void print()
	{
		System.out.println("hello a");
	}
	public void display()
	{
		print();
		b1.print();
	}
	
}
