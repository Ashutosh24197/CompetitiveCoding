public class MinAndMax {
    public static void findMinMax1(int []arr) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }

    public static void findMinMax2(int []arr) {
        int n = arr.length; 
        int min,max,i;

        if(n==1){
            min = arr[0];
            max = arr[0];
        }else{
              if(arr[0]>arr[1]){
                  max = arr[0];
                  min = arr[1];
              }else{
                  max = arr[1];
                  min = arr[0]; 
              }
              i=2;
              while(i<n-1){
                if (arr[i] > arr[i + 1]) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i + 1] < min) {
                        min = arr[i + 1];
                    }
                } else {
                    if (arr[i + 1] > max) {
                        max = arr[i + 1];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                i += 2;
              }
        }
      

        
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }

    public static void main(String[] args) {
        int arr[] = {4,67,3,8,2,9,6,3};
        
        findMinMax2(arr);
        
    }
}
