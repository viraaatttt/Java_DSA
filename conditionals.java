import java.util.*;
public class conditionals {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Choice: ");
         int button = sc.nextInt();
         switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("error");
         }
         /*System.out.print("Enter b: ");
         int b = sc.nextInt();
         if(age>=18){
         System.out.println("Adult");
         }
         else{
         System.out.println("Not Adult"); 
         if(a==b)
         System.out.println("Equal");
         else if (a>b)
         System.out.println("A is greater");   
         else
         System.out.println("B is greater"); */
    }
}

