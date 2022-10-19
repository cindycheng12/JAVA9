package test1019;
class Caaa{
	private int value;
	public Caaa() 
	{
		value=10;  //(a)value設為10
		System.out.println("value="+value);
	}
	public Caaa(int i)
	{
		value=i;
		System.out.println("value="+value);
	}
}
public class Class03 {
	public static void main(String args[])
	{
		Caaa obj1=new Caaa();
		Caaa obj2=new Caaa(12);
	}
}
//第21行事沒有引數的，第22行有被呼叫引數12   (b)
//否，因為一個檔案裡只能有一個 public 的類別，而且要與檔名相同;如果要將 Caaa 類別宣告成 public，則必須將Caaa類別另存成一個檔案，且名稱要為 Caaa.java。 (c)
// 不會有影響，因為可在其他類別呼叫value成員