class CC{
    static int n;
    public static void add2n(int n) {
        for (int i = 0; i <=n; i++) {
            n=n+i;
        }
        System.out.println(n);
        n=0; //須歸零否則會繼續累計加下去
    }
}
public class Class06 {
    public static void main(String[] args) {
        CCount.add2n(5);
        CCount.add2n(10);
    }
}
