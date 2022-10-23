class CCount{
    static int cnt =0;
    public CCount(){    //(a)
        cnt++;
    }
    void setZero(){  //函數呼叫時cnt=0 (b)
        cnt=0;
    }
    void setValue(int n){   //(c)
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

//(d)是類別變數，因為加上static修飾子，使類別變數與每一個物件共享，因此會隨物件建立而累加
//(e)是實例函數，因為類別函數變成物件共用便無法執行,所以只要執行函數count()時， cnt變累加。
