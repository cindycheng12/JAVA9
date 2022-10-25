class CCircle        
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)       // CCircle建構元
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
      System.out.println("radius="+radius);
   }
}

public class Class16 {
    public static void main(String args[])
    {
       CCircle cir[];
       cir=new CCircle[6];
       for(int i=0;i<cir.length;i++)
       {
        cir[i]=new CCircle(i);
             cir[i].show();
       }
       cir[0]=new CCircle(1.0);
       cir[0].show();
       cir[1]=new CCircle(4.0);
       cir[1].show();  
       cir[2]=new CCircle(2.0);
       cir[2].show();   
    }
}
