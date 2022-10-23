class CCount{
    int cnt =0;
    public CCount(){  
        cnt++;
    }
    void setZero(){  //函數呼叫時cnt=0
        cnt=0;
    }
    void setValue(int n){
        cnt=n;
    }
    public void show()
    {
        System.out.println(cnt);
    }
}

public class Class05 {
    public static void main(String[] args) {
        CCount a=new CCount();
        a.show();
        CCount b=new CCount();   
        CCount c=new CCount();
        b.show();
        a.setZero();//呼叫歸零
        c.show();
    }
}
