package full;

public class sumof1to10 {
    public static void main(String[] args) {
        int n=5;
        int sum=0;

        for(int i=1; i<=10; i++){
            sum+=i; 
            System.err.println(sum);  
        }
        System.err.println("addtion is=" +sum);
    }
    
}
