import java.util.Scanner;

public class о1 {
    public static boolean p(int a,int b){
if (a+b<21 && a+b>9){
return true;
         } else {return false;}
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(p(a,b));
    }

}
