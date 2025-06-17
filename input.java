import java.util.*;
public class input {
    public static void main(String args[]){
        // Input in java is taken using a scanner class which has to be imported at the beginning of java program
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        // next only takes one token to take multiple tokens use nextLine()
        String name =sc.nextLine();
        System.out.println(name);
        //nextInt(), nextFloat() etc.

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }
}
