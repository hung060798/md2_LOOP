import java.util.Scanner;
public class ucln {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = input.nextInt();
        System.out.println("Nhap b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if (a>b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.println("UCLN la: " +a);
    }
}
