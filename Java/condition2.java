import java.util.Scanner;
public class condition2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("not eligible for job");
        }
        else if(age>=18 && age<=54){
            System.out.println("eligible for job");
        }
        else if(age>=55 && age<=57){
            System.out.println("eligible for job , but retirement soon");
        }
        else if(age>57){
            System.out.println("retirement time");
        }
    }
}
