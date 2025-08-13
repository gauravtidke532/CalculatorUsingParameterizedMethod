import java.util.Scanner;
public class CalculatorFormalArgumentActualArgument {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welecome to the app(calculator) ");
        System.out.println("press 1 for addition operation");
        System.out.println("press 2 for substraction operation");
        System.out.println("press 3 for multiplication operation");
        System.out.println("press 4 for division operation");
        System.out.println("press 5 for modulas operation");
        int choice = s.nextInt();
        System.out.println("enter the 1st value");
        int a = s.nextInt();
        System.out.println("enter the  2nd value");
        int b = s.nextInt();
        // using switch statement for one by one process sathi
        switch(choice){
            case 1:{
                add(a,b);
                break;
            }
            case 2:{
                sub(a,b);
                break;
            }
            case 3:{
                mul(a,b);
                break;
            }
            case 4:{
                div(a,b);
                break;
            }
            case 5:{
                modulas(a,b);
                break;
            }

        }

    }

    public static void add(int a , int b) {
        int res=a+b;
        System.out.println("the addition of 2 numbers is: "+res);
    }
    public static void sub(int a , int b) {
        int res=a-b;
        System.out.println("the subtraction of 2 numbers is: "+res);
    }
    public static void mul(int a , int b) {
        int res=a*b;
        System.out.println("the multiplication of 2 numbers is: "+res);
    }
    public static void div(int a , int b) {
        int res=a/b;
        System.out.println("the division of 2 numbers is: "+res);
    }
    public static void modulas(int a , int b) {
        int res=a%b;
        System.out.println("the modulas of 2 numbers is: "+res);
    }
}
