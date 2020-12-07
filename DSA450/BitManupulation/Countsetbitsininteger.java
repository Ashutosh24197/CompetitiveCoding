//package BitManupulation;

public class Countsetbitsininteger {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        while(n>0){
            ans+=n%2;
            n/=2;
        }

        System.out.println(ans);
    }
    
}
