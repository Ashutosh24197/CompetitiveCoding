
public class TotalBitsCount {
    public static int maxPowOf2inRange(int n){
        int x=0;
        while((1 << x)<=n){
            x++;
        }

        return x-1;
    }

    public static int bitCount(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int x = maxPowOf2inRange(n);
        int ans = 0;
        ans = x * (1 << (x-1)) + n - (1 << x) + 1 + bitCount(n-(1 << x));
        //System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 11;
        //System.out.println(maxPowOf2inRange(n));
        System.out.println(bitCount(n));
    }
    
}
