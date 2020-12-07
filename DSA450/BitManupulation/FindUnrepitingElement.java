public class FindUnrepitingElement {

    public static int[] singleNumber(int[] nums)
    {
        
        int []ans = new int[2];
        int xor = 0;
        for(int x:nums){
            xor^=x;
        }
        //System.out.println(xor);
        int rbm = xor & -xor;
        //System.out.println(rbm);
        int a = 0;
        int b = 0;
        
        for(int x:nums){
            //System.out.println(rbm & x);
            if((rbm & x)==0){
                a ^=x;
            }else{
                b ^=x;
            }
        }
        
        if(a<b){
            ans[0]=a;
            ans[1]=b;
        }else{
            ans[0]=b;
            ans[1]=a;
        }
        
        return ans;
        
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,1,2,4};
        int []ans  = new int[2];
        ans=singleNumber(nums);
        System.out.println(ans[0]+ ans[1]);
    }
    
}
