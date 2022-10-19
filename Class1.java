package test1019;
class CRectangle
{
	int width;
	int height;
	public CRectangle(int w,int h)
	{
		width=w;
		height=h;
	}
	public CRectangle() //沒有引數的建構元  (a)
	{
		width=10;
		height=8;
	}
	//	public CRectangle() //沒有引數的建構元  (b)
	//{
		//this(10,8);
		//int width;
		//int height;
	//}
	
	public void show()
	{
		System.out.println("width="+width);
		System.out.println("height="+height);
		
	}

}

public class Class1 {
	public static void main(String args[])
	{
		CRectangle c1=new CRectangle();
		c1.show();
	}
}
