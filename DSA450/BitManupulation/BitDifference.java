public class BitDifference {

    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int n = a^b;
        int ans=0;
        while(n>0){
            ans+=n%2;
            n/=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(countBitsFlip(a, b));
    }
    
}
