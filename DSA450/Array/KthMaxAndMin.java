import java.util.*;
public class KthMaxAndMin {

    public static int kthMin(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int x:arr){
            pq.add(x);
        }

        for(int i=1;i<k;i++){
            pq.poll();
        }

        return pq.poll();

    }

    public static int kthMax(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int x:arr){
            pq.add(x);
        }

        for(int i=0;i<arr.length-k;i++){
            pq.poll();
        }

        return pq.poll();

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(kthMin(arr,3));
        System.out.println(kthMax(arr,3));
    }
}
