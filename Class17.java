package test1026;
class Namecard
{
	private String name;
	private String address;	
	private Phone data;

	class Phone
	{
		private String company;
		private String cell;
		public Phone(String s1,String s2)  //Phone類別的建構元
		{
			company=s1;
			cell=s2;
		}

		public void show_data()
		{
		      System.out.println("公司電話"+company);
		      System.out.println("手機號碼:"+cell);
		}
	}
	public Namecard(String n,String a,String s1,String s2) {
		name=n;
		address=a;
		data=new Phone(s1,s2);
	}
	public void show(){
	      System.out.println("好友姓名:"+name);
	      System.out.println("聯絡地址:"+address);
	      data.show_data();
	}
	
}
public class Class17 {
	public static void main(String args[])
	{
		Namecard first=new Namecard("Andy","123City","2345-6789","0911-336600");
		first.show();
	}
}
