import java.util.Scanner;
public class btVeHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap chieu dai:");
                    int a = sc.nextInt();
                    System.out.println("Nhap chieu rong:");
                    int b = sc.nextInt();
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 2:
                    for (int i = 1; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 4:
                    System.exit(4);
                default:
                    System.out.println("no choice");
            }
        }
    }
