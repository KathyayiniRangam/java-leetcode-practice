public class whileLoppExample {
    public static void main(String[] args){
        int i=123;
        // while(i<5){
        //     System.out.println("Hello");
        //     i++;
        // }
        // do{
        //     System.out.println("Hello");
        // }while(i<5);
        int sum=0;
        while(i!=0){
            sum=sum+(i%10);
            i=i/10;
        }
        System.out.println(sum);
    }
}
