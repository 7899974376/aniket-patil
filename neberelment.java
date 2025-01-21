package array.star;
public class neberelment {
    public static void main(String[] args) {
        int [] arr={15,10,9,30,50,20};
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]>arr[i+1]){
                    System.out.println(arr[i]);
                }
            }
            else if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    System.out.println(arr[i]);
                }
            }
            else{
                if(arr[i]>arr[i+1]&& arr[i]>arr[i-1]){
                    System.out.println(arr[i]);
                }
            }
        }
      
    }
    
}
